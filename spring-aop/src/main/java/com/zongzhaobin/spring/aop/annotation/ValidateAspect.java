package com.zongzhaobin.spring.aop.annotation;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

/**
 * @author zzb
 * @version V1.0
 * @creat 2022 0919 21:32
 */
@Component
@Aspect
@Order(1)
public class ValidateAspect {
    @Before("com.zongzhaobin.spring.aop.annotation.LoggerAspect.pointCut()")
    public void validateAspect(){
        System.out.println("ValidateAspect-->前置通知");
    }
}
