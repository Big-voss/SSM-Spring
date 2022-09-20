package com.zongzhaobin.spring.dao;

/**
 * @author zzb
 * @version V1.0
 * @creat 2022 0920 15:03
 */
public interface BookDao {
    Integer getPriceByBookId(Integer bookId);
    void updateStock(Integer bookId);
    void updateBalance(Integer userId, Integer price);
}