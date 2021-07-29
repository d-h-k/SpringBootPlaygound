package com.example.SpringBootPlaygound.core_2spring.member.repo;

import com.example.SpringBootPlaygound.core_2spring.member.entity.Member;

public interface MemberRepository {

    Member save(Member member);

    Member findById(Long memberId);

}
