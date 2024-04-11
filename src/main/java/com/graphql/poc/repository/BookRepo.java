package com.graphql.poc.repository;

import com.graphql.poc.entities.Book;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BookRepo extends JpaRepository<Book,Integer>{

    }

