package com.example.SpringBootPlaygound.spring_core_1pojo.service;

import com.example.SpringBootPlaygound.spring_core_1pojo.entity.Member;
import com.example.SpringBootPlaygound.spring_core_1pojo.repository.MemberRepository;
import com.example.SpringBootPlaygound.spring_core_1pojo.repository.MemoryMemberRepository;

public class MemberServiceImp implements MemberService{

    private MemberRepository memberRepository = new MemoryMemberRepository();

    @Override
    public Member join(Member member) {
        return memberRepository.save(member);
    }
}
