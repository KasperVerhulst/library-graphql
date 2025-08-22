package com.example.graphqldemo.repository;

import com.example.graphqldemo.entity.Member;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IMemberRepository extends JpaRepository<Member,Long> {

}
