package com.graphql.poc.entities;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name="tech_books")
@Getter
@Setter
@ToString
@AllArgsConstructor
@NoArgsConstructor
public class Book {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String title;
    private String desc;
    private String author;
    private double price;

}
