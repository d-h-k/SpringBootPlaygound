package com.example.SpringBootPlaygound.spring_core_1pojo;

import com.example.SpringBootPlaygound.spring_core_1pojo.entity.Grade;
import com.example.SpringBootPlaygound.spring_core_1pojo.entity.Member;
import com.example.SpringBootPlaygound.spring_core_1pojo.entity.Order;
import com.example.SpringBootPlaygound.spring_core_1pojo.service.MemberService;
import com.example.SpringBootPlaygound.spring_core_1pojo.service.MemberServiceImp;
import com.example.SpringBootPlaygound.spring_core_1pojo.service.OrderService;
import com.example.SpringBootPlaygound.spring_core_1pojo.service.OrderServiceImp;

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
