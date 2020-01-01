package cn.henu.controller.admin;

import cn.henu.pojo.Category;
import cn.henu.pojo.User;
import cn.henu.service.SortService;
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
import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Controller
public class SortController {
    @Value("${IMAGE_SERVER_URL}")
    private String IMAGE_SERVER_URL;
    @Autowired
    private SortService sortService;

    @RequestMapping("/admin/sort")
    public String sort(HttpServletRequest request){
        //System.out.println("我执行了");
        List<Category> categories= sortService.findAll();
        for (int i=0;i<categories.size();i++){
            categories.get(i).setCategoryPid(sortService.countBlogInCategory(categories.get(i).getCategoryId()));
        }
        request.setAttribute("categorys",categories);
        return "admin/category";
    }

    @RequestMapping(value = "/category/add")
    public 	void addCategory(Category category, HttpServletRequest request, HttpServletResponse response, @RequestParam("photoFile") MultipartFile file) throws IOException {
        Object obj= request.getSession().getAttribute("user");
        //获取session中的userID如果不存在或者不是Integer说明出现异常
        if(obj!=null && obj instanceof User){
            category.setUserId((int)((User) obj).getUserId());
        }else{
            request.setAttribute("addPhotoStatus","error");
        }
        //调用service进行添加操作
        Map fileurl=uploadFile(file);
        if(Integer.parseInt(fileurl.get("error").toString())==0){
            //获取error存的值
            category.setCategoryImg(fileurl.get("url").toString());
        }else{
            category.setCategoryImg("");
        }
        System.out.println(category);
        String res=sortService.addCategory(category);
        request.setAttribute("addCategoryStatus",res);
        //返回Photo页面
        response.sendRedirect("/admin/sort"); //这里执行的是controller方法进行跳转的，不是直接找的页面
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

    @RequestMapping("/category/del")
    @ResponseBody
    public String delCategory(@RequestParam("id") String id){
        int cateId=Integer.parseInt(id);
        return sortService.delCategoryById(cateId)>0?"success":"fail";
    }

    ///admin/updateCategoryPage
    @RequestMapping("/admin/updateCategoryPage")
    public String updateCategoryPage(@RequestParam("id") Integer id,HttpServletRequest request){
        Category category = sortService.findByCategoryId(id);
        request.setAttribute("updateCategory",category);
        return "/admin/update_category";
    }
    @RequestMapping("/admin/updateCategory")
    public void updatePhoto(Category category, HttpServletRequest request, HttpServletResponse response, @RequestParam("photoFile") MultipartFile file) throws IOException {
        Category category2=sortService.findByCategoryId(category.getCategoryId());
        category.setUserId(category2.getUserId());
        if(!category.getCategoryImg().equals(category2.getCategoryImg())){
            Map fileurl=uploadFile(file);
            if(Integer.parseInt(fileurl.get("error").toString())==0){
               category.setCategoryImg(fileurl.get("url").toString());
            }else{
                category.setCategoryImg("");
            }
        }else{
            category.setCategoryImg(category2.getCategoryImg());
        }
        //调用service进行添加操作
        int res=sortService.updateByCategoryId(category);
        response.sendRedirect("/admin/sort");
    }
}
