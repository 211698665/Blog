package cn.henu.controller.admin;

import cn.henu.pojo.User;
import cn.henu.service.LoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

@Controller

public class LoginController {

    @Autowired
    private LoginService loginService;
    @RequestMapping("/admin/login")
    public String login(){
        return "/admin/login";
    }
    @RequestMapping("/login/check")
    public void loginCheck(User user, HttpSession session, HttpServletResponse response) throws IOException {
        System.out.println(user+":user");

        int res=loginService.checkUser(user);
        User user2=loginService.findByEmail(user.getUserMail());
        System.out.println(user2);
        if(res>0){
            session.setAttribute("user",user2);
            response.sendRedirect("/admin/index");
        }else{
            response.sendRedirect("/admin/login");
        }
    }
}
