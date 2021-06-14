package com.TDDTutorial.service;

import com.TDDTutorial.repository.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.TDDTutorial.model.Book;

import java.util.Optional;


@Service
public class BookService {

    @Autowired
    private BookRepository bookRepository;

    public Iterable<Book> getAllBooks() {
        return bookRepository.findAll();
    }

    public Book getBookById(int id) {
        Optional<Book> returnBook = bookRepository.findById(id);
        return returnBook.isPresent() ? returnBook.get() : null;
    }

    public String saveBook(Book book) {
        bookRepository.save(book);
        return("Successful Save");
    }

    public String deleteBook(int id) {
        bookRepository.deleteById(id);
        return ("Successful Delete");
    }

}
