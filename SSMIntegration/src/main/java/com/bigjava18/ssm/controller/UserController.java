package com.bigjava18.ssm.controller;

import com.bigjava18.ssm.model.User;
import com.bigjava18.ssm.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @Author zgp
 * @Since 2021 -05 -14 17 :36
 * @Description 用户Controller
 */
@RestController
public class UserController {

    @Autowired
    UserService userService;

    @GetMapping("/getAllUser")
    public List<User> getAllUser(){
        List<User> userList=userService.getAllUser();
        return userList;
    }
}
