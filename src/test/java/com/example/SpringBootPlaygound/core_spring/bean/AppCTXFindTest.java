package com.example.SpringBootPlaygound.core_spring.bean;

import com.example.SpringBootPlaygound.core_spring.AppConfig;
import com.example.SpringBootPlaygound.core_spring.member.entity.Member;
import com.example.SpringBootPlaygound.core_spring.member.repo.MemberRepository;
import com.example.SpringBootPlaygound.core_spring.order.discountpolicy.DiscountPolicy;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.NoUniqueBeanDefinitionException;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import static org.junit.jupiter.api.Assertions.assertThrows;

public class AppCTXFindTest {
    AnnotationConfigApplicationContext ac
            = new AnnotationConfigApplicationContext(AppConfig.class);


    @Test
    @DisplayName("타입으로 조회시 같은 타입이 둘 이상 있으면 중복오류 발생")
    void findByTypeDuplicateError() {
        //DiscountPolicy policyBean = ac.getBean(MemberRepository.class);
        assertThrows(NoUniqueBeanDefinitionException.class, () -> ac.getBean(Member.class));

    }
}
