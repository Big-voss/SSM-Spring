package com.zongzhaobin.spring.service.impl;

import com.zongzhaobin.spring.dao.UserDao;
import com.zongzhaobin.spring.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author zzb
 * @version V1.0
 * @creat 2022 0915 16:06
 */
@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserDao userDao;

    @Override
    public void saveUser() {
        userDao.saveUser();
    }
}
