package com.zongzhaobin.spring.test;

import com.zongzhaobin.spring.aop.annotation.Calculator;
import com.zongzhaobin.spring.aop.annotation.CalculatorImpl;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author zzb
 * @version V1.0
 * @creat 2022 0919 19:55
 */
public class AOPTest {

    @Test
    public void AOPByAnnotationTest(){
        ApplicationContext ioc =  new ClassPathXmlApplicationContext("aop-annotation.xml");
        Calculator calculator = ioc.getBean(Calculator.class);
        calculator.div(10,2);

    }
}
