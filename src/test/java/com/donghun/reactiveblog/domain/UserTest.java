package com.donghun.reactiveblog.domain;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.time.LocalDateTime;
import java.util.UUID;

import static org.assertj.core.api.BDDAssertions.then;

/**
 * @author donghL-dev
 * @since  2019-12-01
 */
public class UserTest {

    @Test
    @DisplayName("User 객체 생성 테스트.")
    public void userCreateTest() {

        // given
        String id = UUID.randomUUID().toString();
        String username = "test_user";
        String email = "test_user@email.com";
        String password = "test_password";
        String bio = "나는 Test_User 입니다.";
        LocalDateTime createdAt = LocalDateTime.now();

        // when
        User user = User.builder()
                .id(id)
                .username(username)
                .email(email)
                .password(password)
                .bio(bio)
                .createdAt(createdAt)
                .build();

        // then
        then(user).isNotNull();
        then(user.getId()).isEqualTo(id);
        then(user.getUsername()).isEqualTo(username);
        then(user.getEmail()).isEqualTo(email);
        then(user.getPassword()).isEqualTo(password);
        then(user.getBio()).isEqualTo(bio);
        then(user.getCreatedAt()).isEqualTo(createdAt);
    }
}