package com.example.SpringBootPlaygound.spring_core_1pojo.service;

import com.example.SpringBootPlaygound.spring_core_1pojo.entity.Member;
import com.example.SpringBootPlaygound.spring_core_1pojo.entity.Order;
import com.example.SpringBootPlaygound.spring_core_1pojo.repository.MemberRepository;
import com.example.SpringBootPlaygound.spring_core_1pojo.repository.MemoryMemberRepository;

public class OrderServiceImp implements OrderService{

    private final MemberRepository memberRepository = new MemoryMemberRepository();
    private final DiscountPolicy discountPolicy = new FixDiscountPolicy();


    @Override
    public Order createOrder(Long memberId, String itemName, Integer itemPrice) {

        Member member = memberRepository.findById(memberId);
        int discount = discountPolicy.discount(member,itemPrice);
        return new Order(memberId, itemName, itemPrice, discount);
    }
}
