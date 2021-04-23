package com.da.service;

import com.da.dao.BookMapper;
import com.da.pojo.Books;

import java.util.List;

/**
 * @author wu
 * @version 1.0
 * @date 2021/4/23
 */
public class BookServiceImpl implements BookService{
    //service 调dao层：组合Dao
    private BookMapper bookMapper;
    public void setBookMapper(BookMapper bookMapper){
        this.bookMapper=bookMapper;
    }

    @Override
    public int addBook(Books books) {
        return bookMapper.addBook(books);
    }

    @Override
    public int deleteBook(int id) {
        return bookMapper.deleteBook(id);
    }

    @Override
    public int updateBook(Books books) {
        return bookMapper.updateBook(books);
    }

    @Override
    public Books queryBookById(int id) {
        return bookMapper.queryBookById(id);
    }

    @Override
    public List<Books> queryAllBook() {
        return bookMapper.queryAllBook();
    }
}
