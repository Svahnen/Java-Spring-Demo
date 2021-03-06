package com.example.springdemo.controllers;

import com.example.springdemo.models.Book;
import com.example.springdemo.models.BookLombok;
import com.example.springdemo.models.BooksDao;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;

@RestController
public class BookController {

    @RequestMapping("/books")
    public List<Book> getBook() {
        BooksDao booksDao = BooksDao.getInstance();
        return booksDao.getBooks();
    }

    @RequestMapping("/book/{id}")
    public Book getBook(@PathVariable int id) {
        BooksDao booksDao = BooksDao.getInstance();
        return booksDao.getBooks().get(id);
    }

    @RequestMapping("/book/{idNr}/delete")
    public String deleteBook(@PathVariable int idNr) {
        BooksDao booksDao = BooksDao.getInstance();
        booksDao.deleteBook(idNr);
        return "Book with idNr " + idNr + " deleted";
    }

    /*     
    localhost:8080/book/add
    {
        "title": "test",
        "author": "Svahnen"
    }
    */
    @PostMapping("/book/add")
    public String addBook(@RequestBody Book book) {
        BooksDao booksDao = BooksDao.getInstance();
        booksDao.addBook(book.getTitle(), book.getAuthor());
        return "Book added";
    }

    @RequestMapping("/booklombok")
    public BookLombok getBookLombok() {
        BookLombok book = new BookLombok("Lombok", "Svahnen", 1);
        return book;
    }

}
