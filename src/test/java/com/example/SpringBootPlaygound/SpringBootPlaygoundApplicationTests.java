package com.example.SpringBootPlaygound;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.transaction.annotation.Transactional;

import java.util.Collection;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

@Transactional // 저장하지않고 트랜잭숀으로 자동백업해서 테스트 여려번 돌릴수있게(디비는 저장하는거자나)
@SpringBootTest // 이거 써야 스프링으로 테스트 할수 있고 오토와이어드 쓸 수 있다
class SpringBootPlaygoundApplicationTests {


    private Logger logger = LoggerFactory.getLogger(SpringBootPlaygoundApplicationTests.class);
    @Autowired
    private ApplicationContext ctx;
    @Autowired
    private UserRepo userRepo;

    @Test
    @DisplayName("IoC 컨테이너 정상동작 확인")
    void contextLoads() {
        assertThat(logger).isNotNull();
        assertThat(ctx).isNotNull();
    }

    @Test
    @DisplayName("Spring Data JDBC MYSQL 연동 확인")
    void readUser() {
		Long id = 1L;
		User user = userRepo.findById(id).get();
		assertThat(user).isNotNull();
		logger.info("User ID : {} : {}",id,user);

		Long id2 = 3L;
		assertThat(userRepo.findById(id2).isPresent()).isFalse();

		Iterable<User> users = userRepo.findAll();
		//assertThat(((Collection) user).size()).isEqualTo(2);
        //이거뭐하는거지 왜 에러나는거지굿
    }

}
