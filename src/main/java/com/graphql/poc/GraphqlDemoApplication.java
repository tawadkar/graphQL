package com.graphql.poc;

import com.graphql.poc.entities.Book;
import com.graphql.poc.services.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class GraphqlDemoApplication implements CommandLineRunner {

	@Autowired
	private BookService bookService;
	public static void main(String[] args) {
		SpringApplication.run(GraphqlDemoApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
        Book b1 = new Book();
		b1.setTitle("GraphQL Basics");
		b1.setDesc("Learn GrapthQL from Basic");
		b1.setPrice(4000);
		b1.setAuthor("TestGraphQL");

		Book b2 = new Book();
		b2.setTitle("Python Basics");
		b2.setDesc("Learn Python from Basic");
		b2.setPrice(5000);
		b2.setAuthor("TestPyton");

		//Saves book in Database
		this.bookService.create(b1);
		this.bookService.create(b2);
	}
}
