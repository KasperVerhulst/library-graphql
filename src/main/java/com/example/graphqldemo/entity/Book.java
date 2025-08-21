package com.example.graphqldemo.entity;

import com.example.graphqldemo.util.Genre;
import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Positive;


import java.time.LocalDate;

@Entity
@Table(name = "book")
public class Book {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotBlank(message = "Title is required")
    private String title;

    @Enumerated(EnumType.ORDINAL)
    private Genre genre;

    private LocalDate releaseDate;

    @Positive(message = "Page Count needs to be a positive, non-zero number")
    private int pageCount;

    @ManyToOne
    @JoinColumn(name = "author_id")
    private Author author;
}
