package com.example.SpringBootPlaygound.spring_core_1pojo.member.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Setter @Getter
@AllArgsConstructor
public class Member {
    private Long id;
    private String name;
    private Grade grade;
}
