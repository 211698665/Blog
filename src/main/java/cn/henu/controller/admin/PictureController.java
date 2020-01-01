package cn.henu.controller.admin;

import cn.henu.pojo.Photo;
import cn.henu.pojo.User;
import cn.henu.service.PictureService;
import cn.henu.utils.FastDFSClient;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.*;

@Controller
public class PictureController {
    @Autowired
    private PictureService pictureService;
    @Value("${IMAGE_SERVER_URL}")
    private String IMAGE_SERVER_URL;
    @RequestMapping("/admin/photo")
    public ModelAndView findAllPhoto(@RequestParam(required = false,defaultValue = "1",value = "pn")Integer pn,@RequestParam(defaultValue = "8") Integer pageSize,HttpServletRequest request){
        PageHelper.startPage(pn, pageSize);
        List list=new LinkedList<Photo>();
        list=pictureService.adminFindAllPhoto();
        PageInfo<Photo> plist = new PageInfo<>(list);
        ModelAndView view = new ModelAndView();
        view.addObject("photolist", plist.getList());
        view.setViewName("admin/photo");
        int photoPageNum;
        if(pictureService.countPhoto()%pageSize==0){
            photoPageNum=pictureService.countPhoto()/pageSize;
        }else{
            photoPageNum=pictureService.countPhoto()/pageSize+1;
        }
        request.setAttribute("pageSize",photoPageNum);
        request.setAttribute("currPage",pn);
        return view;
    }
    @RequestMapping("/admin/updatePhotoPage")
    public String updatePhotoPage(@RequestParam("id") Integer id,HttpServletRequest request){
        System.out.println("id值"+id);
        Photo photo = pictureService.findPhotoById(id);
        request.setAttribute("updatePhoto",photo);
        return "/admin/update_photo";
    }
    @RequestMapping("/admin/updatePhoto")
    public void updatePhoto(Photo photo, HttpServletRequest request, HttpServletResponse response, @RequestParam("photoFile") MultipartFile file) throws IOException {
            Photo photo2 = pictureService.findPhotoById(photo.getPhotoId());
            Date date = new Date();
            photo.setPhotoUpdateTime(date);
            photo.setPhotoCreateTime(photo2.getPhotoCreateTime());
            photo.setUserId(photo2.getUserId());
            if(!photo.getPhotoUrl().equals(photo2.getPhotoUrl())){
                Map fileurl=uploadFile(file);
                if(Integer.parseInt(fileurl.get("error").toString())==0){
                    //获取error存的值
                    photo.setPhotoUrl(fileurl.get("url").toString());
                }else{
                    photo.setPhotoUrl("");
                }
            }else{
                photo.setPhotoUrl(photo2.getPhotoUrl());
            }
            //调用service进行添加操作
            int res=pictureService.updatePhoto(photo);
            response.sendRedirect("/admin/photo");
    }
    @RequestMapping(value = "/photo/add")
    public 	void addPhoto(Photo photo, HttpServletRequest request, HttpServletResponse response, @RequestParam("photoFile") MultipartFile file) throws IOException {
        Object obj= request.getSession().getAttribute("user");
        //获取session中的userID如果不存在或者不是Integer说明出现异常
        if(obj!=null && obj instanceof User){
            photo.setUserId((int)((User) obj).getUserId());
        }else{
            request.setAttribute("addPhotoStatus","error");
        }
        Date date = new Date();
        photo.setPhotoUpdateTime(date);
        photo.setPhotoCreateTime(date);
        //调用service进行添加操作
        Map fileurl=uploadFile(file);
        if(Integer.parseInt(fileurl.get("error").toString())==0){
            //获取error存的值
            photo.setPhotoUrl(fileurl.get("url").toString());
        }else{
            photo.setPhotoUrl("");
        }
        System.out.println(photo);
        String res=pictureService.addPhoto(photo);
        request.setAttribute("addPhotoStatus",res);
        //返回Photo页面
        response.sendRedirect("/admin/photo");
    }
    @RequestMapping("/photo/del")
    @ResponseBody
    public String delPhoto(@RequestParam("id") String id){
        int photoId=Integer.parseInt(id);
        System.out.println(photoId);
        return pictureService.delPhoto(photoId)>0?"success":"fail";
    }
    public Map uploadFile(@RequestParam("photoFile")MultipartFile  uploadFile) {
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





}
