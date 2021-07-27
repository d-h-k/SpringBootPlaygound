package com.example.SpringBootPlaygound.core_1pojo.order.discountpolicy;

import com.example.SpringBootPlaygound.core_1pojo.member.entity.Member;

public interface DiscountPolicy {
    int discount(Member member, int originalPrice);
}
