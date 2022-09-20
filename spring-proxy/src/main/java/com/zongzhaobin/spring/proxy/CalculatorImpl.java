package com.zongzhaobin.spring.proxy;

/**
 * @author zzb
 * @version V1.0
 * @creat 2022 0919 9:58
 */
public class CalculatorImpl implements Calculator{
    @Override
    public int add(int i, int j) {
      int result =  i + j;
        System.out.println("方法内部" + result);
        return result;
    }

    @Override
    public int sub(int i, int j) {
        int result =  i - j;
        System.out.println("方法内部" + result);
        return result;
    }

    @Override
    public int mul(int i, int j) {
        int result =  i * j;
        System.out.println("方法内部" + result);
        return result;
    }

    @Override
    public int div(int i, int j) {
        int result =  i / j;
        System.out.println("方法内部" + result);
        return result;
    }
}
