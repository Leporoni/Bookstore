package com.leporonitech.bookstore.service;

import com.leporonitech.bookstore.model.Book;

import java.util.List;

public interface BookService {

    public List<Book> listAll();

    public Book getById(String id);

    public Book create(Book book);

    public List<Book> getByName(String name);
}
