package com.zongzhaobin.spring.service;

/**
 * @author zzb
 * @version V1.0
 * @creat 2022 0920 17:28
 */
public interface CheckoutService {
    void checkout(Integer[] bookIds, Integer userId);
}

