package com.zongzhaobin.spring.controller;

import com.zongzhaobin.spring.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

/**
 * @author zzb
 * @version V1.0
 * @creat 2022 0915 16:05
 */

@Controller("controller")
public class UserController {
    @Autowired
    private UserService userService;

    public void saveUser(){
        userService.saveUser();
    }
}
