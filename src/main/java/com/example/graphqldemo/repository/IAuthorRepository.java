package com.example.graphqldemo.repository;

import com.example.graphqldemo.entity.Author;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface IAuthorRepository extends JpaRepository<Author,Long> {

}
