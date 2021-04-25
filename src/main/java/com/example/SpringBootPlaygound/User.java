package com.example.SpringBootPlaygound;

import org.springframework.data.annotation.Id;
import org.springframework.data.relational.core.mapping.Embedded;

import java.util.HashMap;
import java.util.HashSet;

public class User {
    @Id
    private Long id;

    private String email;
    private String name;

    @Embedded.Nullable // 임베디드고 널을 허용해주겠다
    private Github github;// 1:1 관계일 때에는 이렇게 끼워넣고 끝

    //private Set<food> foods = new HashSet<>();


    public User(String email, String name, Github github) {
        this.email = email;
        this.name = name;
        this.github = github;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Github getGithub() {
        return github;
    }

    public void setGithub(Github github) {
        this.github = github;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", email='" + email + '\'' +
                ", name='" + name + '\'' +
                ", github=" + github +
                '}';
    }
}
