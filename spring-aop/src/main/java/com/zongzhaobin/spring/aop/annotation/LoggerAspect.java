package com.zongzhaobin.spring.aop.annotation;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.Signature;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

import java.util.Arrays;

/**
 * @author zzb
 * @version V1.0
 * @creat 2022 0919 19:28
 */
@Component
@Aspect
public class LoggerAspect {
    @Pointcut("execution(public int com.zongzhaobin.spring.aop.annotation.CalculatorImpl.*(..))")
    public void pointCut(){

    }

    @Before("pointCut()")
    public void beforeAdviceMethod(JoinPoint joinPoint){
        String name = joinPoint.getSignature().getName();
        Object[] args = joinPoint.getArgs();
        System.out.println("LoggerAspect, 前置通知 方法名: " + name + " 参数: " + Arrays.toString(args));
    }

    @After("pointCut()")
    public void afterAdviceMethod(JoinPoint joinPoint){
        Signature signature = joinPoint.getSignature();
        Object[] args = joinPoint.getArgs();
        System.out.println("LoggerAspect, 后置通知");
    }

    @AfterReturning(value = "pointCut()",returning = "result")
    public void afterRunningMethod(JoinPoint joinPoint,Object result){
        Signature signature = joinPoint.getSignature();
        System.out.println("LoggerAspect, 返回通知 方法名: " + signature.getName() + " 结果: " + result);
    }

    @AfterThrowing(value = "pointCut()",throwing = "ex")
    public void afterThrowingMethod(JoinPoint joinPoint,Throwable ex){
        Signature signature = joinPoint.getSignature();
        System.out.println("LoggerAspect, 异常通知 方法名: " + signature.getName() + " 异常为: "+ ex);
    }

    @Around("pointCut()")
    public Object aroundMethod(ProceedingJoinPoint proceedingJoinPoint){
        Object result = null;
        try {
            System.out.println("环绕通知-->前置通知");
            result = proceedingJoinPoint.proceed();
            System.out.println("环绕通知-->返回通知");
        } catch (Throwable throwable) {
            throwable.printStackTrace();
            System.out.println("环绕通知-->异常通知");
        } finally {
            System.out.println("环绕通知-->后置通知");
        }
        return result;
    }
}
