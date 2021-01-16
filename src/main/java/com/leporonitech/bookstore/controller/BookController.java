package com.leporonitech.bookstore.controller;

import com.leporonitech.bookstore.model.Book;
import com.leporonitech.bookstore.repository.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/books")
public class BookController {

    @Autowired
    private BookRepository bookRepository;

    @GetMapping
    public List<Book> listAll(){
        return bookRepository.findAll();
    }

    @PostMapping
    public Book create(@RequestBody Book book) {
        return bookRepository.save(book);
    }


}
