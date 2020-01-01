package cn.henu.controller.admin;

import cn.henu.pojo.Ability;
import cn.henu.pojo.Link;
import cn.henu.pojo.User;
import cn.henu.service.FlinkService;
import cn.henu.service.MeService;
import cn.henu.utils.FastDFSClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Controller
public class MeController {
    @Autowired
    private MeService meService;
    @Autowired
    private FlinkService flinkService;
    @Value("${IMAGE_SERVER_URL}")
    private String IMAGE_SERVER_URL;
    @RequestMapping("/admin/ability")
    public String ability(HttpServletRequest request){
        List<Ability> ablities= meService.findAll();
        request.setAttribute("abilities",ablities);
        return "admin/my_ability";
    }
    @RequestMapping("/admin/detail")
    public String detail(HttpServletRequest request, HttpSession session){
        //int userId = (int)session.getAttribute("userId");
        request.setAttribute("detail",meService.findByKey(1)); //这里因为还没有做登录
        return "admin/my_detail";
    }
    @RequestMapping("/update/detail")
    public String updateDetail(User user,HttpServletRequest request, @RequestParam("photoFile") MultipartFile file){
        Date date = new Date();
        User user2=meService.findByKey(user.getUserId());
        user.setUserPassword(user2.getUserPassword());
        user.setUserUpdatetime(date);
        if(!user.getUserImage().equals(user2.getUserImage())){
            Map fileurl=uploadFile(file);
            if(Integer.parseInt(fileurl.get("error").toString())==0){
                user.setUserImage(fileurl.get("url").toString());
            }else{
                user.setUserImage("");
            }
        }else{
            user.setUserImage(user2.getUserImage());
        }
        request.setAttribute("detail",user);
        user.setUserCreatetime(user2.getUserCreatetime());
        user.setUserId(user2.getUserId());
        int res=meService.updateById(user);
        if(res>0){
            request.setAttribute("result","更新成功");
        }else{
            request.setAttribute("result","更新失败");
        }
        return "admin/my_detail";
    }
    @RequestMapping("/ability/add")
    public void addAbility(Ability ability, HttpServletResponse response,HttpServletRequest request) throws IOException {
        Object obj= request.getSession().getAttribute("user");
        //获取session中的userID如果不存在或者不是Integer说明出现异常
        if(obj!=null && obj instanceof User){
            ability.setUserId((int)((User) obj).getUserId());
        }else{
            request.setAttribute("addPhotoStatus","error");
        }
        Date date = new Date();
        ability.setAbilityUpdateTime(date);
        meService.addAbility(ability);
        response.sendRedirect("/admin/ability");
    }
    @RequestMapping("/ability/del")
    @ResponseBody
    public String delAbility(@RequestParam("id") String id){
        int abId=Integer.parseInt(id);
        return meService.delAbilityById(abId)>0?"success":"fail";
    }
    public Map uploadFile(@RequestParam("photoFile") MultipartFile uploadFile) {
        try {
            //把图片上传到图片服务器
            FastDFSClient fastDFSClient = new FastDFSClient("classpath:conf/client.conf");
            //获取文件的扩展名
            String filename = uploadFile.getOriginalFilename();
            String extName=filename.substring(filename.lastIndexOf(".")+1);
            //得到文件的地址和文件名
            String url = fastDFSClient.uploadFile(uploadFile.getBytes(), extName);
            //补充为完整的url
            url=IMAGE_SERVER_URL+url;
            //封装到Map中返回
            Map map = new HashMap<>();
            map.put("error", 0);
            map.put("url", url);
            return map;
        } catch (Exception e) {
            e.printStackTrace();
            Map map = new HashMap<>();
            map.put("error", 1);
            map.put("message", "图片上传失败");
            return map;
        }
    }
    @RequestMapping("/admin/flink")
    public String flink(HttpServletRequest request){
        List<Link> list=flinkService.findAll();
        request.setAttribute("flinks",list);
        return "/admin/my_flink";
    }
    @RequestMapping("/admin/addFlink")
    public String addFlinkPage(HttpServletRequest request){
        return "/admin/add_flink";
    }
    @RequestMapping("/add/flink")
    public void addFlink(Link link,HttpServletRequest request,@RequestParam("photoFile") MultipartFile file,HttpServletResponse response) throws IOException {
        Object obj= request.getSession().getAttribute("user");
        //获取session中的userID如果不存在或者不是Integer说明出现异常
        if(obj!=null && obj instanceof User ){
            link.setUserId((int)((User) obj).getUserId());
        }else{
            request.setAttribute("addPhotoStatus","error");
        }
        Date date = new Date();
        link.setLinkCreateTime(date);
        link.setLinkUpdateTime(date);
        Map fileurl=uploadFile(file);
        if(Integer.parseInt(fileurl.get("error").toString())==0){
            //获取error存的值
            link.setLinkImg(fileurl.get("url").toString());
        }else{
            link.setLinkImg("");
        }
        flinkService.addFlink(link);
        response.sendRedirect("/admin/flink");
    }
    @RequestMapping("/flink/del")
    @ResponseBody
    public String delFlink(@RequestParam("id") String id){
        int flinkId=Integer.parseInt(id);
        return flinkService.delFlink(flinkId)>0?"success":"fail";
    }

    @RequestMapping("/admin/updateFlinkPage")
    public String updatePage(@RequestParam("id") Integer id,HttpServletRequest request){
        Link link=flinkService.findById(id);
        request.setAttribute("updateLink",link);
        return "/admin/update_flink";
    }
    @RequestMapping("/flink/update")
    public void updateFlink(Link link, HttpServletRequest request, HttpServletResponse response, @RequestParam("photoFile") MultipartFile file) throws Exception {

        Link link1=flinkService.findById(link.getLinkId());

        if(!link.getLinkImg().equals(link1.getLinkImg())){
            Map fileurl=uploadFile(file);
            link.setLinkImg(fileurl.get("url").toString());
        }
        Date date = new Date();
        link.setLinkUpdateTime(date);
        link.setUserId(link1.getUserId());
        //修改文章
        flinkService.updateFlink(link);

        response.sendRedirect("/admin/flink");
    }
}
