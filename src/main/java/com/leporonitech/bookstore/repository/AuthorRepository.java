package com.leporonitech.bookstore.repository;

import com.leporonitech.bookstore.model.Author;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface AuthorRepository extends MongoRepository<Author, String> {

    public List<Author> findByName(String name);
}
