package com.example.SpringBootPlaygound.core_2spring;

import com.example.SpringBootPlaygound.core_2spring.member.entity.Grade;
import com.example.SpringBootPlaygound.core_2spring.member.entity.Member;
import com.example.SpringBootPlaygound.core_2spring.member.service.MemberService;
import com.example.SpringBootPlaygound.core_2spring.order.Order;
import com.example.SpringBootPlaygound.core_2spring.order.OrderService;

public class AppLauncher {
    public static Member member1;
    public static Member member2;
    public static Order order1;


    static { // pre-dataset
        member1 = new Member(3L, "summer", Grade.BASIC);
        member2 = new Member(4L, "winter", Grade.VIP);
        order1 = new Order(member1.getId(),"맥북프로16", 50000 ,-1);
    }


    public static void main(String[] args) {
        AppConfig appConfig = new AppConfig();
        MemberService memberService = appConfig.memberService();
        OrderService orderService = appConfig.orderService();



        memberService.join(member1);
        memberService.join(member2);
        //프리셋 데이터에는 할인가가 적용되어있지 않음
        Order order = orderService.createOrder(order1.getMemberId(), order1.getItemName(), order1.getItemPrice());
        System.out.println("order : " + order.toString());

    }


}
