package com.example.SpringBootPlaygound.spring_core_1pojo.service;

import com.example.SpringBootPlaygound.spring_core_1pojo.entity.Member;

public interface DiscountPolicy {
    int discount(Member member, int originalPrice);
}
