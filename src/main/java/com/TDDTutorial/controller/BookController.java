package com.TDDTutorial.controller;

import com.TDDTutorial.model.Book;
import com.TDDTutorial.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@CrossOrigin
@RestController
@RequestMapping("/")
public class BookController {

    @Autowired
    private BookService bookService;

    @GetMapping("/{id}")
    public Book getBookById(@PathVariable String id) {
        return bookService.getBookById(Integer.parseInt(id));
    }

    @GetMapping("/")
    public List<Book> getAllBooks() {
        List<Book> list = new ArrayList<Book>();
        Iterable<Book> returnList = bookService.getAllBooks();

        returnList.forEach(e -> list.add(e));

        return list;
    }

    @PostMapping("/")
    public void saveBook() {
        bookService.saveBook(new Book());
    }

    @PutMapping("/")
    public void updateBook() {
        bookService.saveBook(new Book());
    }

    @DeleteMapping("/{id}")
    public void deleteBook(@PathVariable String id) {
        bookService.deleteBook(Integer.parseInt(id));
    }


}
