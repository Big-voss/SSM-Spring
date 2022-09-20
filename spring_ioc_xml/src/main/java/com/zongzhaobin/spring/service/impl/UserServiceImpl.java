package com.zongzhaobin.spring.service.impl;

import com.zongzhaobin.spring.dao.UserDao;
import com.zongzhaobin.spring.service.UserService;

/**
 * @author zzb
 * @version V1.0
 * @creat 2022 0915 14:28
 */
public class UserServiceImpl implements UserService {
    private UserDao userDao;

    public UserDao getUserDao() {
        return userDao;
    }

    public void setUserDao(UserDao userDao) {
        this.userDao = userDao;
    }

    @Override
    public void saveUser() {
        userDao.saveUser();
    }
}
