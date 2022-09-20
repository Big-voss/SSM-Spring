package com.zongzhaobin.spring.dao.impl;

import com.zongzhaobin.spring.dao.UserDao;

/**
 * @author zzb
 * @version V1.0
 * @creat 2022 0915 14:31
 */
public class UserDaoImpl implements UserDao {
    @Override
    public void saveUser() {
        System.out.println("保存成功");
    }
}
