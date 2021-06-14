package com.TDDTutorial.model;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.util.Objects;

@Data
@Entity
public class Book {

    /**
     * Instance variables for the book object.
     */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id = 0;

    private String title;
    private String author;
    private String genre;
    private String publisher;

    public Book() {

    }
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public String getPublisher() {
        return publisher;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Book book = (Book) o;
        return Objects.equals(id, book.getId()) &&
                Objects.equals(title, book.getTitle()) &&
                Objects.equals(author, book.getAuthor()) &&
                Objects.equals(genre, book.getGenre()) &&
                Objects.equals(publisher, book.getPublisher());
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, title, author, genre, publisher);
    }


}
