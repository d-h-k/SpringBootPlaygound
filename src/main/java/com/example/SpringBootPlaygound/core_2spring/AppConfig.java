package com.example.SpringBootPlaygound.core_2spring;

import com.example.SpringBootPlaygound.core_2spring.member.repo.MemberRepository;
import com.example.SpringBootPlaygound.core_2spring.member.repo.MemoryMemberRepository;
import com.example.SpringBootPlaygound.core_2spring.member.service.MemberService;
import com.example.SpringBootPlaygound.core_2spring.member.service.MemberServiceImp;
import com.example.SpringBootPlaygound.core_2spring.order.OrderService;
import com.example.SpringBootPlaygound.core_2spring.order.OrderServiceImp;
import com.example.SpringBootPlaygound.core_2spring.order.discountpolicy.DiscountPolicy;
import com.example.SpringBootPlaygound.core_2spring.order.discountpolicy.FixDiscountPolicy;

public class AppConfig {


    //member 도메인 관련
    public MemberService memberService() {
        return new MemberServiceImp(memberRepository());
    }


    //order 도메인 관련
    public OrderService orderService () {
        return new OrderServiceImp(
                memberRepository(),
                discountPolicy()
        );
    }

    public MemberRepository memberRepository() {
        return new MemoryMemberRepository();
    }

    public DiscountPolicy discountPolicy() {
        //return new RateDiscountPolicy();
        return new FixDiscountPolicy();
    }
    //todo : 이게 왜 어떤의미인지 잘 모르겠다.. 2021.07.29

}
