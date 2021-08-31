package com.example.springbootdemo.controller;

import com.example.springbootdemo.pojo.User;
import com.example.springbootdemo.service.UserServiceImpl;
import com.example.springbootdemo.util.JsonData;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

@RestController
public class UserController {

    @Resource
    private UserServiceImpl userService;

    @RequestMapping("/getUser")
    public String getUserList(){
        List<User> userList = userService.getUserList();
        return JsonData.BuildJsonData(200,"Ok",userList);
    }

    @RequestMapping("/addUser")
    public String AddUser(User user){
        int res=userService.addUser(user);
        return JsonData.BuildJsonData(200,"Ok",res);
    }

    @RequestMapping("/updatePwd")
    public String updatePwd(User user){
        int res=userService.updatePwd(user);
        return JsonData.BuildJsonData(200,"Ok",res);
    }

    @RequestMapping("/getUserByName")
    public String getUserByUsername(String username){
        User user=userService.getUserByUsername(username);
        return JsonData.BuildJsonData(200,"Ok",user);
    }

}
