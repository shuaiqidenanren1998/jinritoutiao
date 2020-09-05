package com.qf.controller;

import com.qf.pojo.User;
import com.qf.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("user")
public class UserController {

    @Autowired
    private UserService userService;

    @RequestMapping("login")
    public User login (String name, String password) {

        User user = userService.login(name, password);
        System.out.println(user);
        return user;
    }

    @RequestMapping("register")
    public User register (String name, String password) {

        User user = userService.register(name, password);

        return user;

    }

}
