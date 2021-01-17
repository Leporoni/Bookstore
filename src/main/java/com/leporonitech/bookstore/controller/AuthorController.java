package com.leporonitech.bookstore.controller;

import com.leporonitech.bookstore.model.Author;
import com.leporonitech.bookstore.service.AuthorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/authors")
public class AuthorController {

    @Autowired
    private AuthorService authorService;

    @GetMapping
    public List<Author> listAll(){

        return authorService.listAll();
    }

    @PostMapping
    public Author create(@RequestBody Author author) {

        return authorService.create(author);
    }
}
