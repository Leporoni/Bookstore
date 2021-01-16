package com.leporonitech.bookstore.controller;

import com.leporonitech.bookstore.model.Author;
import com.leporonitech.bookstore.repository.AuthorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/authors")
public class AuthorController {

    @Autowired
    private AuthorRepository authorRepository;

    @GetMapping
    public List<Author> listAll(){
        return authorRepository.findAll();
    }

    @PostMapping
    public Author create(@RequestBody Author author) {
        return authorRepository.save(author);
    }
}
