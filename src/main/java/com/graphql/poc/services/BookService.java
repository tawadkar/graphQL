package com.graphql.poc.services;

import com.graphql.poc.entities.Book;

import java.util.List;

public interface BookService {

    //Create Book
    Book create (Book book);

    //Get List of all the Books
    List<Book> getAll();

    //Get Single Books
    Book get(int BookId);


}
