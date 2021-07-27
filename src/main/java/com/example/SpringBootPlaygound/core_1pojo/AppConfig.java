package com.example.SpringBootPlaygound.core_1pojo;

import com.example.SpringBootPlaygound.core_1pojo.member.repo.MemberRepository;
import com.example.SpringBootPlaygound.core_1pojo.member.repo.MemoryMemberRepository;
import com.example.SpringBootPlaygound.core_1pojo.member.service.MemberService;
import com.example.SpringBootPlaygound.core_1pojo.member.service.MemberServiceImp;
import com.example.SpringBootPlaygound.core_1pojo.order.OrderService;
import com.example.SpringBootPlaygound.core_1pojo.order.OrderServiceImp;
import com.example.SpringBootPlaygound.core_1pojo.order.discountpolicy.DiscountPolicy;
import com.example.SpringBootPlaygound.core_1pojo.order.discountpolicy.FixDiscountPolicy;
import com.example.SpringBootPlaygound.core_1pojo.order.discountpolicy.RateDiscountPolicy;

public class AppConfig {


    //member 도메인 관련
    public MemberService memberService() {
        return new MemberServiceImp(new MemoryMemberRepository());
    }


    //order 도메인 관련
    public OrderService orderService () {
        return new OrderServiceImp(new MemoryMemberRepository(),new FixDiscountPolicy());
    }



}
