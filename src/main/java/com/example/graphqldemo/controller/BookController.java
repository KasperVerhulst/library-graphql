package com.example.graphqldemo.controller;

import com.example.graphqldemo.entity.Author;
import com.example.graphqldemo.entity.Book;
import com.example.graphqldemo.repository.IBookRepository;
import com.example.graphqldemo.util.Genre;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.graphql.data.method.annotation.Argument;
import org.springframework.graphql.data.method.annotation.MutationMapping;
import org.springframework.graphql.data.method.annotation.QueryMapping;
import org.springframework.stereotype.Controller;

import java.util.List;

@Controller
public class BookController {

    @Autowired
    private IBookRepository bookRepository;

    @QueryMapping("books")
    public List<Book> getBooks() {
        return bookRepository.findAll();
    }

    @QueryMapping("booksByGenre")
    public List<Book> getBooksByGenre(@Argument("genre") Genre genre) {
        return bookRepository.findAllByGenre(genre);
    }

    @QueryMapping("booksByAuthorName")
    public List<Book> getBooksByAuthor(@Argument("firstName") String firstName, @Argument("lastName") String lastName) {
        if (firstName == null || firstName.isBlank()) {
            return bookRepository.findByAuthorLastName(lastName);
        }
        else {
            return bookRepository.findByAuthorFirstNameAndAuthorLastName(firstName, lastName);
        }
    }

}

