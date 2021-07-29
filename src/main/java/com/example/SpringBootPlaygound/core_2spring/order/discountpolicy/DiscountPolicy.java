package com.example.SpringBootPlaygound.core_2spring.order.discountpolicy;

import com.example.SpringBootPlaygound.core_2spring.member.entity.Member;

public interface DiscountPolicy {
    int discount(Member member, int originalPrice);
}
