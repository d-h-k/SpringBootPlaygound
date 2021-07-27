package com.example.SpringBootPlaygound.spring_core_1pojo.order;

import com.example.SpringBootPlaygound.spring_core_1pojo.order.Order;

public interface OrderService {
    Order createOrder(Long memberId, String itemName, Integer itemPrice);
}
