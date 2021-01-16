package com.leporonitech.bookstore.service.impl;

import com.leporonitech.bookstore.model.Author;
import com.leporonitech.bookstore.model.Book;
import com.leporonitech.bookstore.repository.AuthorRepository;
import com.leporonitech.bookstore.repository.BookRepository;
import com.leporonitech.bookstore.service.AuthorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AuthorServiceImpl implements AuthorService {

    @Autowired
    AuthorRepository authorRepository;

    @Autowired
    BookRepository bookRepository;

    @Override
    public List<Author> listAll() {
        return this.authorRepository.findAll();
    }

    @Override
    public Author getById(String id) {
        return this.authorRepository
                .findById(id)
                .orElseThrow(() -> new IllegalArgumentException("Author does not exist."));
    }

    @Override
    public Author create(Author author) {
        Book name =
                this.bookRepository
                .findById(author.getBook().getName())
                .orElseThrow(() -> new IllegalArgumentException("Books does not exist."));
        author.setBook(name);

        return this.authorRepository.save(author);
    }

    @Override
    public List<Author> getByName(String name) {
        return this.authorRepository.findByName(name);
    }
}
