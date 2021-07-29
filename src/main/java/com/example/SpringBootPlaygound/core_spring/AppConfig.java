package com.example.SpringBootPlaygound.core_spring;

import com.example.SpringBootPlaygound.core_spring.member.repo.MemberRepository;
import com.example.SpringBootPlaygound.core_spring.member.repo.MemoryMemberRepository;
import com.example.SpringBootPlaygound.core_spring.member.service.MemberService;
import com.example.SpringBootPlaygound.core_spring.member.service.MemberServiceImp;
import com.example.SpringBootPlaygound.core_spring.order.OrderService;
import com.example.SpringBootPlaygound.core_spring.order.OrderServiceImp;
import com.example.SpringBootPlaygound.core_spring.order.discountpolicy.DiscountPolicy;
import com.example.SpringBootPlaygound.core_spring.order.discountpolicy.FixDiscountPolicy;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;


@Configuration
public class AppConfig {

    @Bean //member 도메인 관련
    public MemberService memberService() {
        return new MemberServiceImp(memberRepository());
    }

    @Bean //order 도메인 관련
    public OrderService orderService () {
        return new OrderServiceImp(
                memberRepository(),
                discountPolicy()
        );
    }

    @Bean
    public MemberRepository memberRepository() {
        return new MemoryMemberRepository();
    }

    @Bean
    public DiscountPolicy discountPolicy() {
        return new FixDiscountPolicy();
    }

    //AppConfig에 설정을 구성한다는 뜻의 @Configuration 을 붙여준다.
    //각 메서드에 @Bean 을 붙여준다. 이렇게 하면 스프링 컨테이너에 스프링 빈으로 등록한다.
}
