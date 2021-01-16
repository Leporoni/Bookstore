package com.leporonitech.bookstore.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Document
public class Book {
	
	@Id
	private String id;
	
	private String name;
	
	@DBRef
	private Author author;

}
