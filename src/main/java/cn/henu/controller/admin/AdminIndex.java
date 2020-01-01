package cn.henu.controller.admin;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class AdminIndex {
    @RequestMapping("/admin/index")
    public String adminIndex(){
        return "/admin/index";
    }
}
