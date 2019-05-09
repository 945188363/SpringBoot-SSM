package com.njh.springboot.usermanage.controller;

import com.njh.springboot.usermanage.dao.UserMapper;
import com.njh.springboot.usermanage.domain.User;
import com.njh.springboot.usermanage.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserHandler {

    //依赖注入
    @Autowired
    UserService userService;

    @RequestMapping(value = "pic")
    public User pic() {
        //调用service层
        User user = userService.getUser("lmj");
        return user;
    }

}
