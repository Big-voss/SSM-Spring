package com.zongzhaobin.spring.service.impl;

import com.zongzhaobin.spring.service.BookService;
import com.zongzhaobin.spring.service.CheckoutService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * @author zzb
 * @version V1.0
 * @creat 2022 0920 17:29
 */
@Service
public class CheckoutServiceImpl implements CheckoutService {
    @Autowired
    private BookService bookService;
    @Override
    @Transactional
//一次购买多本图书
    public void checkout(Integer[] bookIds, Integer userId) {
        for (Integer bookId : bookIds) {
            bookService.buyBook(bookId, userId);
        }
    }
}

