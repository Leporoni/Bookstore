package com.leporonitech.bookstore.repository;

import com.leporonitech.bookstore.model.Author;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AuthorRepository extends MongoRepository<Author, String> {
}
