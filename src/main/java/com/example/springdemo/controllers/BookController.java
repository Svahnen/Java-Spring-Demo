package com.example.springdemo.controllers;

import com.example.springdemo.models.Book;
import com.example.springdemo.models.BookLombok;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BookController {

    @RequestMapping("/book")
    public Book getBook() {
        return new Book("Svahn Food", "Svahnen", 12345);
    }

    @RequestMapping("/booklombok")
    public BookLombok getBookLombok() {
        BookLombok book = new BookLombok("Lombok", "Svahnen", 1);
        return book;
    }

}
