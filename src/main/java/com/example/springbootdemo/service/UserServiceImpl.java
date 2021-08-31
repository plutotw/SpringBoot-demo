package com.example.springbootdemo.service;

import com.example.springbootdemo.dao.UserDao;
import com.example.springbootdemo.pojo.User;
import com.example.springbootdemo.util.GetCurrentTime;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;
import java.util.UUID;

@Service
public class UserServiceImpl implements UserService{

    @Resource
    private UserDao userDao;

    @Override
    public List<User> getUserList() {
        List<User> userList = userDao.getUserList();
        return userList;
    }

    @Override
    public int addUser(User user) {
        UUID uuid = UUID.randomUUID();
        user.setUuid(uuid.toString());
        user.setRegistrationtime(GetCurrentTime.getCurrentTime());
        int res=userDao.addUser(user);
        return res;
    }

    @Override
    public int updatePwd(User user) {
        int res=userDao.updatePwd(user);
        return res;
    }

    @Override
    public User getUserByUsername(String username) {
        User user = userDao.getUserByUsername(username);
        return user;
    }
}
