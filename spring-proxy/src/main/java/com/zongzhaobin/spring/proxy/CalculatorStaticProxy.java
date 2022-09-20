package com.zongzhaobin.spring.proxy;

/**
 * @author zzb
 * @version V1.0
 * @creat 2022 0919 10:39
 */
public class CalculatorStaticProxy implements Calculator{
    private CalculatorImpl target;

    public CalculatorStaticProxy(CalculatorImpl target) {
        this.target = target;
    }

    @Override
    public int add(int i, int j) {
        System.out.println("日志: 执行了, 方法是 add 参数 " + i + " 和 " + j);
        int result = target.add(i, j);
        System.out.println("日志: 结果为:" + result);
        return result;
    }

    @Override
    public int sub(int i, int j) {
        System.out.println("日志: 执行了, 方法是 sub 参数 " + i + " 和 " + j);
        int result = target.sub(i, j);
        System.out.println("日志: 结果为:" + result);
        return result;
    }

    @Override
    public int mul(int i, int j) {
        System.out.println("日志: 执行了, 方法是 mul 参数 " + i + " 和 " + j);
        int result = target.mul(i, j);
        System.out.println("日志: 结果为:" + result);
        return result;
    }

    @Override
    public int div(int i, int j) {
        System.out.println("日志: 执行了, 方法是 div 参数 " + i + " 和 " + j);
        int result = target.div(i, j);
        System.out.println("日志: 结果为:" + result);
        return result;
    }
}
