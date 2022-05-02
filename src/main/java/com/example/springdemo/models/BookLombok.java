package com.example.springdemo.models;

import lombok.Data; // Auto creates getters and setters

@Data
public class BookLombok {
    private String title;
    private String author;
    private int id;

    public BookLombok() {
    }

    public BookLombok(String title, String author, int id) {
        this.title = title;
        this.author = author;
        this.id = id;
    }
}
