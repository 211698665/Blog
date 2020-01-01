package cn.henu.service;

import cn.henu.pojo.User;

public interface LoginService {
    int checkUser(User user);
    User findByEmail(String userMail);
}
