package cn.henu.controller.admin;

import cn.henu.pojo.Comment;
import cn.henu.service.ArticleService;
import cn.henu.service.CommentService;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

@Controller
public class CommentController {
    @Autowired
    private CommentService commentService;
    @Autowired
    private ArticleService articleService;

    @RequestMapping("/admin/comment")
    private String comment(@RequestParam(required = false,defaultValue = "1",value = "pn")Integer pn, @RequestParam(defaultValue = "12") Integer pageSize, HttpServletRequest request) throws  Exception{
        PageHelper.startPage(pn, pageSize);
        SimpleDateFormat formatdate = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        List<Comment> list = commentService.findAll();
        PageInfo<Comment> plist = new PageInfo<>(list);
        int photoPageNum;
        if(commentService.countComm()%pageSize==0){
            photoPageNum=commentService.countComm()/pageSize;
        }else{
            photoPageNum=commentService.countComm()/pageSize+1;
        }
        String date="";
        for (int i=0;i<list.size();i++){
            date=formatdate.format(list.get(i).getCommentCreateTime());
            Date newDate=formatdate.parse(date);
            java.sql.Date formaldate=new java.sql.Date(newDate.getTime());
            list.get(i).setCommentCreateTime(formaldate);
        }
        if(commentService.findAll().size()>0){
            request.setAttribute("comments",plist.getList());
        }
        request.setAttribute("pageSize",photoPageNum);
        request.setAttribute("currPage",pn);
        return "/admin/comment";
    }

    @RequestMapping("/comment/del")
    @ResponseBody
    public String delComment(@RequestParam("id") String id){
        int commentId=Integer.parseInt(id);
        int res=commentService.delComment(commentId);//删除留言
        //对应的文章的留言数目减一

        return res>0?"success":"fail";
    }

    ///admin/lookComment
    @RequestMapping("admin/lookComment")
    @ResponseBody
    public String lookComment(String id,HttpServletRequest request){
        request.setAttribute("lookComm",commentService.findCommById(Integer.parseInt(id)));
        return  "/admin/comment_Info?id="+id;
    }
    @RequestMapping("/admin/comment_Info")
    public String lookCommentInfo(String id,HttpServletRequest request){
        Comment comm=commentService.findCommById(Integer.parseInt(id));
        request.setAttribute("lookComm",comm);
        String artticleTitle=articleService.findById(comm.getArticleId()).getArticleTitle();
        request.setAttribute("commentArticle",artticleTitle);
        return  "/admin/comment_Info";
    }

}
