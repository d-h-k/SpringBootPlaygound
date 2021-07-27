package com.example.SpringBootPlaygound.core_1pojo.member.service;

import com.example.SpringBootPlaygound.core_1pojo.member.entity.Member;
import com.example.SpringBootPlaygound.core_1pojo.member.repo.MemberRepository;
import com.example.SpringBootPlaygound.core_1pojo.member.repo.MemoryMemberRepository;

public class MemberServiceImp implements MemberService{

    private MemberRepository memberRepository = new MemoryMemberRepository();

    @Override
    public Member join(Member member) {
        return memberRepository.save(member);
    }
}
