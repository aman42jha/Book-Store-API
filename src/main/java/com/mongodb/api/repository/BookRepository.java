package com.mongodb.api.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.mongodb.api.model.Book;

public interface BookRepository extends MongoRepository<Book,Integer>
{
	
}
