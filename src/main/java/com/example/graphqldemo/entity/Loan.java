package com.example.graphqldemo.entity;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.NoArgsConstructor;

import java.time.LocalDate;
import java.util.Set;

@AllArgsConstructor
@NoArgsConstructor
@Builder
@Entity
@Table(name = "loan")
public class Loan {

    public static final int MAX_DAYS_TO_RETURN = 14;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotNull
    @Column(updatable = false)
    private LocalDate startDate;

    @NotNull
    @Column(updatable = false)
    private LocalDate endDate;

    @ManyToOne
    @JoinColumn(name = "member_id")
    private Member member;

    @ManyToMany(fetch = FetchType.EAGER)
    private Set<Book> books;
}
