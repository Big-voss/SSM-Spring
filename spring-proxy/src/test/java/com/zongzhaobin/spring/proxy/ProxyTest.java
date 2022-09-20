package com.zongzhaobin.spring.proxy;

import org.junit.Test;

/**
 * @author zzb
 * @version V1.0
 * @creat 2022 0919 10:48
 */
public class ProxyTest {
    @Test
    public void StaticProxyTest(){
        CalculatorStaticProxy calculatorStaticProxy = new CalculatorStaticProxy(new CalculatorImpl());
        calculatorStaticProxy.add(1,2);
    }
    @Test
    public void ProxyTest(){
        ProxyFactory proxyFactory = new ProxyFactory(new CalculatorImpl());
        Calculator proxy = (Calculator) proxyFactory.getProxy();
        proxy.mul(1,0);
    }


}
