package com.example.demo.service.impl;

import com.example.demo.entity.AppUser;
import com.example.demo.security.JwtTokenProvider;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class AppUserServiceImpl {

    private final JwtTokenProvider jwtTokenProvider;

    public String login(AppUser user) {
        String token = jwtTokenProvider.createToken(user);
        return token;
    }
}
