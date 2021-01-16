package com.leporonitech.bookstore.model;

import java.util.List;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.Data;

@Data
@Document
public class Author {
	
	@Id
	private String id;
	
	private String name;
	
	private String email;
	
	@DBRef
	private List<Book> books;

}
