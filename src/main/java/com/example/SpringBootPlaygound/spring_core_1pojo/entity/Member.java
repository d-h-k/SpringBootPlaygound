package com.example.SpringBootPlaygound.spring_core_1pojo.entity;

import com.example.SpringBootPlaygound.spring_core_1pojo.entity.Grade;
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
