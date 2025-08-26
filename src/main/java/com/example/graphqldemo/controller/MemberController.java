package com.example.graphqldemo.controller;

import com.example.graphqldemo.entity.Member;
import com.example.graphqldemo.input.MemberInput;
import com.example.graphqldemo.repository.IMemberRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.graphql.data.method.annotation.Argument;
import org.springframework.graphql.data.method.annotation.MutationMapping;
import org.springframework.graphql.data.method.annotation.QueryMapping;
import org.springframework.stereotype.Controller;

import java.util.List;

@Controller
public class MemberController {

    @Autowired
    private IMemberRepository memberRepository;

    @QueryMapping("members")
    public List<Member> getMembers() {
        return memberRepository.findAll();
    }

    @MutationMapping("enrollMember")
    public Member enrollMember(@Argument("newMember") MemberInput memberInput) {
        Member member = Member.builder()
                .firstName(memberInput.firstName())
                .lastName(memberInput.lastName())
                .birthDate(memberInput.birthDate()).build();
        return memberRepository.save(member);
    }

}
