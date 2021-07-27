package com.example.SpringBootPlaygound.spring_core_1pojo.order;

import com.example.SpringBootPlaygound.spring_core_1pojo.member.entity.Member;
import com.example.SpringBootPlaygound.spring_core_1pojo.member.repo.MemberRepository;
import com.example.SpringBootPlaygound.spring_core_1pojo.member.repo.MemoryMemberRepository;
import com.example.SpringBootPlaygound.spring_core_1pojo.order.discountpolicy.DiscountPolicy;
import com.example.SpringBootPlaygound.spring_core_1pojo.order.discountpolicy.FixDiscountPolicy;

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