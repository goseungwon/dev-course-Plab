package com.example.plab.domain.member.service;

import com.example.plab.entity.Member;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface MemberRepository extends JpaRepository<Member, Long> {
    List<Member> findByName(String name);

    List<Member> findByEmail(String email);
}
