package com.example.graphqldemo.entity;


import jakarta.persistence.*;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import org.springframework.data.annotation.CreatedDate;

import java.time.LocalDate;
import java.util.Date;
import java.util.List;

@Entity
@Table(name = "member")
public class Member {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String firstName;

    @NotBlank
    private String lastName;

    @Email
    private String email;

    private LocalDate birthDate;

    @CreatedDate
    @Column(nullable = false, updatable = false)
    private Date joinDate;
}
