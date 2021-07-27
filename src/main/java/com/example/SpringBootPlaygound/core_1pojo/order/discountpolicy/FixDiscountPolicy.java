package com.example.SpringBootPlaygound.core_1pojo.order.discountpolicy;


import com.example.SpringBootPlaygound.core_1pojo.member.entity.Member;
import com.example.SpringBootPlaygound.core_1pojo.member.entity.Grade;

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
