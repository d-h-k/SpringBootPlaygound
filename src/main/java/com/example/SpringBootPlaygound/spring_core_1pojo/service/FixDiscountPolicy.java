package com.example.SpringBootPlaygound.spring_core_1pojo.service;


import com.example.SpringBootPlaygound.spring_core_1pojo.entity.Member;
import com.example.SpringBootPlaygound.spring_core_1pojo.entity.Grade;

public class FixDiscountPolicy implements DiscountPolicy {
    static private final int discountFixAmount = 1000; //1000원 할인

    @Override
    public int discount(Member member, int originalPrice) {
        if (member.getGrade() == Grade.VIP) {
            return discountFixAmount;
        }
        return originalPrice;
    }
}
