package com.example.SpringBootPlaygound.core_2spring.member.service;

import com.example.SpringBootPlaygound.core_2spring.member.entity.Member;
import com.example.SpringBootPlaygound.core_2spring.member.repo.MemberRepository;

public class MemberServiceImp implements MemberService {

    private final MemberRepository memberRepository;

    public MemberServiceImp(MemberRepository memberRepository) {
        this.memberRepository = memberRepository;
    }

    @Override
    public Member join(Member member) {
        return memberRepository.save(member);
    }
}
