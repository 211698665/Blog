package cn.henu.service.impl;

import cn.henu.dao.UserMapper;
import cn.henu.pojo.User;
import cn.henu.service.LoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class LoginServiceImpl implements LoginService {
    @Autowired
    private UserMapper userMapper;
    @Override
    public int checkUser(User user) {
        User user1 = userMapper.selectByUserEmail(user.getUserMail());
        if(user1!=null&&user.getUserPassword().equals(user1.getUserPassword())){
            return 1;
        }
        return 0;
    }

    @Override
    public User findByEmail(String userMail) {
        return userMapper.selectByUserEmail(userMail);
    }
}
