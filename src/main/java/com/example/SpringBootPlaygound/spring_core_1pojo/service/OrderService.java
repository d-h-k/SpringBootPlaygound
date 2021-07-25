package com.example.SpringBootPlaygound.spring_core_1pojo.service;

import com.example.SpringBootPlaygound.spring_core_1pojo.entity.Order;

public interface OrderService {
    Order createOrder(Long memberId, String itemName, Integer itemPrice);
}
