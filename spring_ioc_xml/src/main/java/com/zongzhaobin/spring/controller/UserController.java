package com.zongzhaobin.spring.controller;

import com.zongzhaobin.spring.service.UserService;

/**
 * @author zzb
 * @version V1.0
 * @creat 2022 0915 14:26
 */
public class UserController {

    private UserService userService;

    public UserService getUserService() {
        return userService;
    }

    public void setUserService(UserService userService) {
        this.userService = userService;
    }

    public void saveUser(){
        userService.saveUser();
    }
}
