package com.zongzhaobin.spring.dao.impl;

import com.zongzhaobin.spring.dao.UserDao;
import org.springframework.stereotype.Repository;

/**
 * @author zzb
 * @version V1.0
 * @creat 2022 0915 16:07
 */
@Repository
public class UserDaoImpl implements UserDao {
    @Override
    public void saveUser() {
        System.out.println("添加成功");
    }
}
