package com.example.graphqldemo.controller;

import com.example.graphqldemo.entity.Book;
import com.example.graphqldemo.entity.Loan;
import com.example.graphqldemo.entity.Member;
import com.example.graphqldemo.repository.IBookRepository;
import com.example.graphqldemo.repository.ILoanRepository;
import com.example.graphqldemo.repository.IMemberRepository;
import org.apache.coyote.BadRequestException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.graphql.data.method.annotation.Argument;
import org.springframework.graphql.data.method.annotation.MutationMapping;
import org.springframework.stereotype.Controller;

import java.time.LocalDate;
import java.util.HashSet;
import java.util.Set;

@Controller
public class LoanController {

    @Autowired
    private ILoanRepository loanRepository;

    @Autowired
    private IBookRepository bookRepository;

    @Autowired
    private IMemberRepository memberRepository;

    @MutationMapping("loanBook")
    public Loan loanBook(@Argument("bookIDs") Set<Long> bookIDs, @Argument("memberID") Long memberID) throws BadRequestException {
        Member member = memberRepository.findById(memberID).get();

        Set<Book> books = new HashSet<>(bookRepository.findAllById(bookIDs));
        Loan loan = Loan.builder().member(member).books(books).startDate(LocalDate.now()).endDate(LocalDate.now().plusDays(Loan.MAX_DAYS_TO_RETURN)).build();
        return  loanRepository.save(loan);
    }
}
