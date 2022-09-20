package com.zongzhaobin.spring.test;

import com.zongzhaobin.spring.controller.UserController;
import com.zongzhaobin.spring.dao.UserDao;
import com.zongzhaobin.spring.dao.impl.UserDaoImpl;
import com.zongzhaobin.spring.service.UserService;
import com.zongzhaobin.spring.service.impl.UserServiceImpl;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author zzb
 * @version V1.0
 * @creat 2022 0915 16:09
 */
public class IOCByAnnotationTest {
    @Test
    public void test(){
        ApplicationContext ioc = new ClassPathXmlApplicationContext("spring-ioc-annotation.xml");
        UserController userController = ioc.getBean("controller",UserController.class);
/*        System.out.println(userController);
*//*        UserServiceImpl userService = ioc.getBean(UserServiceImpl.class);*//*
        UserService userService = ioc.getBean(UserService.class);
        System.out.println(userService);
*//*        UserDaoImpl userDao = ioc.getBean(UserDaoImpl.class);*//*
        UserDao userDao = ioc.getBean("userDaoImpl",UserDao.class);
        System.out.println(userDao);*/
        userController.saveUser();
    }

}
