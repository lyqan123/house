package com.bawei.controller;

import java.util.List;

import com.bawei.pojo.User;
import com.bawei.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
@RestController
public class UserController {
    @Autowired
    private UserService userService;
    @RequestMapping("user")
    public List<User> getUsers(){
        return userService.getUsers();
    }


}
