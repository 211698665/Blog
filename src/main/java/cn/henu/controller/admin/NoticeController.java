package cn.henu.controller.admin;

import cn.henu.pojo.Notice;
import cn.henu.pojo.User;
import cn.henu.service.NoticeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

@Controller
public class NoticeController {

    @Autowired
    private NoticeService noticeService;

    @RequestMapping("/admin/notice")
    public String notice(HttpServletRequest request) throws ParseException {
        SimpleDateFormat formatdate = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        List<Notice> list=noticeService.findAllNotice();
        String date="";
        for (int i=0;i<list.size();i++){
            System.out.println("原始的"+list.get(i).getNoticeUpdateTime());
            date=formatdate.format(list.get(i).getNoticeUpdateTime());
            Date newDate=formatdate.parse(date);
            java.sql.Date formaldate=new java.sql.Date(newDate.getTime());
            list.get(i).setNoticeUpdateTime(formaldate);
            System.out.println("之后的"+formaldate);
        }
        if(noticeService.findAllNotice().size()>0){
            request.setAttribute("notices",list);
        }
        return "/admin/notice";
    }
    @RequestMapping("/admin/addNotice")
    public void addNotice(Notice notice, HttpServletResponse response,HttpServletRequest request) throws  Exception{
        Date date = new Date();
        notice.setNoticeUpdateTime(date);
        Object obj= request.getSession().getAttribute("user");
        //获取session中的userID如果不存在或者不是Integer说明出现异常
        if(obj!=null && obj instanceof User){
            notice.setUserId((int)((User) obj).getUserId());
        }else{
            request.setAttribute("addPhotoStatus","error");
        }
        int res=noticeService.insertNotice(notice);
        if(res>0){
            request.setAttribute("result","success");
        }else {
            request.setAttribute("result","fail");
        }
        response.sendRedirect("/admin/notice");
    }

    @RequestMapping("/admin/updateNotice")
    @ResponseBody
    public String updateNotice(String id,HttpServletRequest request){
        System.out.println("id:"+request.getParameter("id"));
        request.setAttribute("updateNotice",noticeService.findNoticeById(Integer.parseInt(id)));
        return  "/admin/notice_Info?id="+id;
    }
    @RequestMapping("/admin/notice_Info")
    public String updateNoticeInfo(String id,HttpServletRequest request){
        System.out.println("id:"+request.getParameter("id"));
        request.setAttribute("updateNotice",noticeService.findNoticeById(Integer.parseInt(id)));
        return  "/admin/notice_Info";
    }
    @RequestMapping("/admin/update_notice")
    public String update(Notice notice,HttpServletRequest request){
        notice.setUserId(noticeService.findNoticeById(notice.getNoticeId()).getUserId());
        Date date = new Date();
        notice.setNoticeUpdateTime(date);
        int res=noticeService.updateNotice(notice);
        request.setAttribute("updateNotice",notice);
        if(res>0){
            request.setAttribute("result","更新成功");
        }else{
            request.setAttribute("result","更新失败");
        }
       return "/admin/notice_Info";
    }
    @RequestMapping("/notice/del")
    @ResponseBody
    public String delNotice(@RequestParam("id") String id){
        int noticeId=Integer.parseInt(id);
        return noticeService.delNotice(noticeId)>0?"success":"fail";
    }

}
