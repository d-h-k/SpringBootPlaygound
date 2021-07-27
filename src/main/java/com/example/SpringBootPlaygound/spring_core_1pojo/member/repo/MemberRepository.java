package com.example.SpringBootPlaygound.spring_core_1pojo.member.repo;

import com.example.SpringBootPlaygound.spring_core_1pojo.member.entity.Member;

public interface MemberRepository {

    Member save(Member member);

    Member findById(Long memberId);

}
