package com.example.SpringBootPlaygound.core_1pojo;

import com.example.SpringBootPlaygound.core_1pojo.member.entity.Grade;
import com.example.SpringBootPlaygound.core_1pojo.member.entity.Member;
import com.example.SpringBootPlaygound.core_1pojo.order.Order;
import com.example.SpringBootPlaygound.core_1pojo.member.service.MemberService;
import com.example.SpringBootPlaygound.core_1pojo.member.service.MemberServiceImp;
import com.example.SpringBootPlaygound.core_1pojo.order.OrderService;
import com.example.SpringBootPlaygound.core_1pojo.order.OrderServiceImp;

public class AppLauncher {
    public static Member member1;
    public static Member member2;

    static { // pre-dataset
        member1 = new Member(3L, "summer", Grade.BASIC);
        member2 = new Member(4L, "winter", Grade.VIP);
    }


    public static void main(String[] args) {
        MemberService service = new MemberServiceImp();

        OrderService orderService = new OrderServiceImp();

        service.join(member1);
        service.join(member2);

        Order order =orderService.createOrder(member1.getId(),"맥북프로16", 50000 );
        System.out.println("order : " + order.toString());

    }


}
