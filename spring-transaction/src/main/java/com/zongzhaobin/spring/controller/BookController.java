package com.zongzhaobin.spring.controller;

import com.zongzhaobin.spring.service.BookService;
import com.zongzhaobin.spring.service.CheckoutService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

/**
 * @author zzb
 * @version V1.0
 * @creat 2022 0920 15:00
 */
@Controller
public class BookController {
    @Autowired
    private BookService bookService;
    @Autowired
    private CheckoutService checkoutService;
    public void buyBook(Integer bookId, Integer userId){
        bookService.buyBook(bookId, userId);
    }

    public void checkout(Integer[] bookIds, Integer userId){
        checkoutService.checkout(bookIds, userId);
    }

}

