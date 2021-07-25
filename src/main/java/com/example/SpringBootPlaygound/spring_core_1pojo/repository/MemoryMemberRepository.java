package com.example.SpringBootPlaygound.spring_core_1pojo.repository;

import com.example.SpringBootPlaygound.spring_core_1pojo.entity.Member;

import java.util.HashMap;
import java.util.Map;

public class MemoryMemberRepository implements MemberRepository {

    private static final Map<Long, Member> memory = new HashMap<>();
    // todo : ConcurrentHashMap 나중에 공부, 해쉬맵은 동시성 이슈 있음

    @Override
    public Member save(Member member) {
        return memory.put(member.getId(), member);
    }

    @Override
    public Member findById(Long memberId) {
        return memory.get(memberId);
    }

}
