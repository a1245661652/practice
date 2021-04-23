package com.da.service;

import com.da.pojo.Books;

import java.util.List;

/**
 * @author wu
 * @version 1.0
 * @date 2021/4/23
 */
public interface BookService {
    //增加一本书
    int addBook(Books Books);
    //删除一本书
    int deleteBook(int id);
    //更新一本书
    int updateBook(Books books);
    //查询一本书
    Books queryBookById(int id);
    //查询全部的书
    List<Books> queryAllBook();
}
