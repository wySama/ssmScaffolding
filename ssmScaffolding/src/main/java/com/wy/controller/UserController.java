package com.wy.controller;

import com.wy.dto.User;
import com.wy.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/user")
public class UserController {
    @Autowired
    private UserService userService;

    @RequestMapping("/index")
    @ResponseBody
    public User  index(){
        User user  = new User("Tom",12,"男");
        return user;
    }

    @RequestMapping("/login")
    public String  login(){
        return "login";
    }

    @RequestMapping("/insert")
    @ResponseBody
    public User  insert(){
        User user  = new User("Lili",15,"女");
        userService.insert(user);
        return user;
    }

    @RequestMapping("/selectById")
    @ResponseBody
    public User  selectById(){
        return  userService.selectById(1);
    }

}
