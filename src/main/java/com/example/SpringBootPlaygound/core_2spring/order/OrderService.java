package com.example.SpringBootPlaygound.core_2spring.order;

public interface OrderService {
    Order createOrder(Long memberId, String itemName, Integer itemPrice);
}
