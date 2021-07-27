package com.example.SpringBootPlaygound.core_1pojo.order;

public interface OrderService {
    Order createOrder(Long memberId, String itemName, Integer itemPrice);
}
