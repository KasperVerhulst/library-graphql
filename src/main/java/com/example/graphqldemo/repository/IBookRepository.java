package com.example.graphqldemo.repository;


import com.example.graphqldemo.entity.Author;
import com.example.graphqldemo.entity.Book;
import com.example.graphqldemo.util.Genre;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface IBookRepository extends JpaRepository<Book,Long> {

    // Queries
    List<Book> findAllByGenre(Genre genre);
    List<Book> findByAuthorLastName(String lastName);
    List<Book> findByAuthorFirstNameAndAuthorLastName(String firstName, String lastName);

    // Mutations
}
