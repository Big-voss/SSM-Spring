package com.zongzhaobin.spring.test;

import com.zongzhaobin.spring.controller.UserController;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author zzb
 * @version V1.0
 * @creat 2022 0915 14:59
 */
public class AutowireByXMLTest {
    @Test
    public void testAutowire(){
        ApplicationContext ioc = new ClassPathXmlApplicationContext("spring-autowire.xml");
        UserController userController = ioc.getBean(UserController.class);
        userController.saveUser();
    }
}
