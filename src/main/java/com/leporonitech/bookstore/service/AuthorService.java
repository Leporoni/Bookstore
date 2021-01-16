package com.leporonitech.bookstore.service;

import com.leporonitech.bookstore.model.Author;

import java.util.List;

public interface AuthorService {

    public List<Author> listAll();

    public Author getById(String id);

    public Author create(Author author);

    public List<Author> getByName(String name);
}
