package com.example.SpringBootPlaygound.spring_core_1pojo.repository;

import com.example.SpringBootPlaygound.spring_core_1pojo.entity.Member;

public interface MemberRepository {

    Member save(Member member);

    Member findById(Long memberId);

}
