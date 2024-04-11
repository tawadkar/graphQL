package com.graphql.poc.Impl;

import com.graphql.poc.entities.Book;
import com.graphql.poc.repository.BookRepo;
import com.graphql.poc.services.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BookServiceImpl implements BookService {

    private BookRepo bookRepo;

    @Autowired
    public BookServiceImpl(BookRepo bookRepo){
        this.bookRepo= bookRepo;
    }

    @Override
    public Book create(Book book) {
        return this.bookRepo.save(book);
    }

    @Override
    public List<Book> getAll() {
        return this.bookRepo.findAll();
    }

    @Override
    public Book get(int BookId) {
        return bookRepo.findById(BookId).orElseThrow(()-> new RuntimeException("Book not found"));
    }
}
