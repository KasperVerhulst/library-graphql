package com.example.graphqldemo.controller;


import com.example.graphqldemo.entity.Author;
import com.example.graphqldemo.repository.IAuthorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.graphql.data.method.annotation.QueryMapping;
import org.springframework.stereotype.Controller;

import java.util.List;

@Controller
public class AuthorController {

    @Autowired
    private IAuthorRepository authorRepository;

    @QueryMapping("authors")
    public List<Author> getAuthors() {
        return authorRepository.findAll();
    }

}
