package com.example.springbootdemo.service;

import com.example.springbootdemo.pojo.User;

import java.util.List;


public interface UserService {

    List<User> getUserList();

    int addUser(User user);

    int updatePwd(User user);

    User getUserByUsername(String username);
}
