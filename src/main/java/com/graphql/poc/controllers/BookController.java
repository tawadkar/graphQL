package com.graphql.poc.controllers;

import com.graphql.poc.entities.Book;
import com.graphql.poc.entities.BookInput;
import com.graphql.poc.services.BookService;
import lombok.Getter;
import lombok.Setter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.graphql.data.method.annotation.Argument;
import org.springframework.graphql.data.method.annotation.MutationMapping;
import org.springframework.graphql.data.method.annotation.QueryMapping;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

//@RestController
//@RequestMapping("/books")
@Controller //For GraphQL
public class BookController {

    @Autowired
    private BookService bookService;

   /* @PostMapping
    public Book create(@RequestBody Book book){
         return this.bookService.create(book);

    }*/

    @MutationMapping("createBook")
    public Book create(@Argument BookInput book){
        Book newBook = new Book();
        newBook.setTitle(book.getTitle());
        newBook.setDesc(book.getDesc());
        newBook.setAuthor(book.getAuthor());
        newBook.setPrice(book.getPrice());

        return this.bookService.create(newBook);

    }



  //  @GetMapping
    @QueryMapping("allBooks")
    public List<Book> getAll(){
        return this.bookService.getAll();
    }

  /*  @GetMapping("/{bookId}")
    public Book getBookbyId(@PathVariable int bookId){

        return this.bookService.get(bookId);
    }*/

    //For GraphQL
    @QueryMapping("getBook")
    public Book getBookbyId(@Argument int bookId){

        return this.bookService.get(bookId);
    }


}
