package com.example.springdemo.models;

import java.util.List;

public class BooksDao {
    private static BooksDao single_instance = null;

    List<Book> books = new java.util.ArrayList<Book>();
    int idNr = 0;

    private BooksDao() {
        books.add(new Book("Svahn Food", "Svahnen", idNr++));
        books.add(new Book("Some other book", "Svahnen", idNr++));
        books.add(new Book("Another book entirely", "Svahnen", idNr++));
        books.add(new Book("Yet another book entirely", "Svahnen", idNr++));

    }

    public List<Book> getBooks() {
        return books;
    }

    public void addBook(String title, String author) {
        books.add(new Book(title, author, idNr++));
    }

    public void deleteBook(int idNr) {
        for (Book book : books) {
            if (book.getId() == idNr) {
                books.remove(book);
                break;

            }
        }
    }

    public static BooksDao getInstance() {
        if (single_instance == null)
            single_instance = new BooksDao();

        return single_instance;
    }
}
