package com.example.demo.repository;

import com.example.demo.entity.AppUser;
import com.example.demo.entity.Role;

import java.util.Optional;

public class AppUserRepositoryImpl implements AppUserRepository {

    @Override
    public Optional<AppUser> findByEmail(String email) {
        return Optional.of(
                AppUser.builder()
                        .id(1L)
                        .email(email)
                        .password("{noop}password")
                        .active(true)
                        .role(Role.ROLE_USER)
                        .build()
        );
    }
}
