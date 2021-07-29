package com.example.SpringBootPlaygound.core_2spring.order.discountpolicy;

import com.example.SpringBootPlaygound.core_2spring.member.entity.Grade;
import com.example.SpringBootPlaygound.core_2spring.member.entity.Member;

public class RateDiscountPolicy implements DiscountPolicy {

    private int discountPercentage = 10;

    @Override
    public int discount(Member member, int originalPrice) {
        if(member.getGrade() == Grade.VIP) {
            return originalPrice * discountPercentage / 100;
        }
        return 0;
    }
}
