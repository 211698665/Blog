package cn.henu.controller.admin;

import cn.henu.pojo.Saying;
import cn.henu.pojo.Timeline;
import cn.henu.pojo.User;
import cn.henu.service.TimelineService;
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
public class TimeController {
    @Autowired
    private TimelineService timeLineService;

    @RequestMapping("/admin/saying")
    public String saying(HttpServletRequest request) throws ParseException {
        SimpleDateFormat formatdate = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        List<Saying> list=timeLineService.findAllSaying();
        String date="";
        for (int i=0;i<list.size();i++){
            date=formatdate.format(list.get(i).getSayingUpdateTime());
            Date newDate=formatdate.parse(date);
            java.sql.Date formaldate=new java.sql.Date(newDate.getTime());
            list.get(i).setSayingUpdateTime(formaldate);
        }
        if(timeLineService.findAllSaying().size()>0){
            request.setAttribute("sayings",list);
        }
        return "/admin/saying";
    }
    @RequestMapping("/saying/del")
    @ResponseBody
    public String delSaying(@RequestParam("id") String id){
        int sayingId=Integer.parseInt(id);
        return timeLineService.delSaying(sayingId)>0?"success":"fail";
    }
    @RequestMapping("/admin/addSaying")
    public void addSaying(Saying saying, HttpServletResponse response, HttpServletRequest request) throws  Exception{
        Date date = new Date();
        Object obj= request.getSession().getAttribute("user");
        //获取session中的userID如果不存在或者不是Integer说明出现异常
        if(obj!=null && obj instanceof User){
            saying.setUserId((int)((User) obj).getUserId());
        }else{
            request.setAttribute("addPhotoStatus","error");
        }
        saying.setSayingCreateTime(date);
        saying.setSayingUpdateTime(date);
        int res=timeLineService.insertSaying(saying);
        if(res>0){
            request.setAttribute("result","success");
        }else {
            request.setAttribute("result","fail");
        }
        response.sendRedirect("/admin/saying");
    }

    @RequestMapping("/admin/updateSaying")
    @ResponseBody
    public String updateNotice(String id,HttpServletRequest request){
        System.out.println("id:"+request.getParameter("id"));
        request.setAttribute("updateSaying",timeLineService.findSayingById(Integer.parseInt(id)));
        return  "/admin/saying_Info?id="+id;
    }
    @RequestMapping("/admin/saying_Info")
    public String updateNoticeInfo(String id,HttpServletRequest request){
        System.out.println("id:"+request.getParameter("id"));
        request.setAttribute("updateSaying",timeLineService.findSayingById(Integer.parseInt(id)));
        return  "/admin/saying_Info";
    }
    @RequestMapping("/admin/update_saying")
    public String update(Saying saying,HttpServletRequest request){
        Date date = new Date();
        saying.setSayingUpdateTime(date);
        Object obj= request.getSession().getAttribute("user");
        //获取session中的userID如果不存在或者不是Integer说明出现异常
        if(obj!=null && obj instanceof User){
            saying.setUserId((int)((User) obj).getUserId());
        }else{
            request.setAttribute("addPhotoStatus","error");
        }
        int res=timeLineService.updateSaying(saying);
        request.setAttribute("updateSaying",saying);
        if(res>0){
            request.setAttribute("result","更新成功");
        }else{
            request.setAttribute("result","更新失败");
        }
        return "/admin/saying_Info";
    }
//从这里开始
    @RequestMapping("/admin/timeline")
    public String timeLine(HttpServletRequest request) throws ParseException {
        SimpleDateFormat formatdate = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        List<Timeline> list=timeLineService.findAllTimeLine();
        String date="";
        for (int i=0;i<list.size();i++){
            System.out.println("原始的"+list.get(i).getTimelineUpdateTime());
            date=formatdate.format(list.get(i).getTimelineUpdateTime());
            Date newDate=formatdate.parse(date);
            java.sql.Date formaldate=new java.sql.Date(newDate.getTime());
            list.get(i).setTimelineUpdateTime(formaldate);
            System.out.println("之后的"+formaldate);
        }
        if(timeLineService.findAllTimeLine().size()>0){
            request.setAttribute("timelines",list);
        }
        return "/admin/timeline";
    }
    @RequestMapping("/timeline/del")
    @ResponseBody
    public String delTimeline(@RequestParam("id") String id){
        int timelineId=Integer.parseInt(id);
        return timeLineService.delTimeline(timelineId)>0?"success":"fail";
    }
    @RequestMapping("/admin/addTimeline")
    public void addTimeline(Timeline timeline, HttpServletResponse response, HttpServletRequest request) throws  Exception{
        Date date = new Date();
        timeline.setTimelineUpdateTime(date);
        Object obj= request.getSession().getAttribute("user");
        //获取session中的userID如果不存在或者不是Integer说明出现异常
        if(obj!=null && obj instanceof User){
            timeline.setUserId((int)((User) obj).getUserId());
        }else{
            request.setAttribute("addPhotoStatus","error");
        }
        int res=timeLineService.insertTimeline(timeline);
        if(res>0){
            request.setAttribute("result","success");
        }else {
            request.setAttribute("result","fail");
        }
        response.sendRedirect("/admin/timeline");
    }

    @RequestMapping("/admin/updateTimeline")
    @ResponseBody
    public String updateTimeline(String id,HttpServletRequest request){
        System.out.println("id:"+request.getParameter("id"));
        request.setAttribute("updateTimeline",timeLineService.findTimelineById(Integer.parseInt(id)));
        return  "/admin/timeline_Info?id="+id;
    }
    @RequestMapping("/admin/timeline_Info")
    public String updateTimelineInfo(String id,HttpServletRequest request){
        System.out.println("id:"+request.getParameter("id"));
        request.setAttribute("updateTimeline",timeLineService.findTimelineById(Integer.parseInt(id)));
        return  "/admin/timeline_Info";
    }
    @RequestMapping("/admin/update_timeline")
    public String update(Timeline timeline, HttpServletRequest request){
        Date date = new Date();
        timeline.setTimelineUpdateTime(date);
        Object obj= request.getSession().getAttribute("user");
        //获取session中的userID如果不存在或者不是Integer说明出现异常
        if(obj!=null && obj instanceof User){
            timeline.setUserId((int)((User) obj).getUserId());
        }else{
            request.setAttribute("addPhotoStatus","error");
        }
        int res=timeLineService.updateTimeline(timeline);
        request.setAttribute("updateTimeline",timeline);
        if(res>0){
            request.setAttribute("result","更新成功");
        }else{
            request.setAttribute("result","更新失败");
        }
        return "/admin/timeline_Info";
    }
}
