package com.example.graphqldemo.repository;

import com.example.graphqldemo.entity.Loan;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ILoanRepository extends JpaRepository<Loan,Long> {

}
