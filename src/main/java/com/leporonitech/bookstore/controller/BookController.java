package com.leporonitech.bookstore.controller;

import com.leporonitech.bookstore.model.Book;
import com.leporonitech.bookstore.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/books")
public class BookController {

    @Autowired
    private BookService bookService;

    @GetMapping
    public List<Book> listAll(){

        return bookService.listAll();
    }

    @PostMapping
    public Book create(@RequestBody Book book) {

        return bookService.create(book);
    }
}
