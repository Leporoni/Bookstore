package com.leporonitech.bookstore.service.impl;

import com.leporonitech.bookstore.model.Author;
import com.leporonitech.bookstore.model.Book;
import com.leporonitech.bookstore.repository.AuthorRepository;
import com.leporonitech.bookstore.repository.BookRepository;
import com.leporonitech.bookstore.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BookServiceImpl implements BookService {

    @Autowired
    BookRepository bookRepository;

    @Autowired
    AuthorRepository authorRepository;

    @Override
    public List<Book> listAll() {
        return this.bookRepository.findAll();
    }

    @Override
    public Book getById(String id) {
        return this.bookRepository
                .findById(id)
                .orElseThrow(() -> new IllegalArgumentException("Book does not exist."));
    }

    @Override
    public Book create(Book book) {
        Author name =
                this.authorRepository
                .findById(book.getAuthor().getId())
                .orElseThrow(() -> new IllegalArgumentException("Author does not exist."));
        book.setAuthor(name);

        return this.bookRepository.save(book) ;
    }

    @Override
    public List<Book> getByName(String name) {
        return this.bookRepository.findByName(name);
    }
}
