package com.example.demo.security;

import com.example.demo.repository.AppUserRepository;
import org.springframework.security.core.userdetails.*;
import org.springframework.stereotype.Service;

@Service
public class CustomUserDetailsService implements UserDetailsService {

    public CustomUserDetailsService(AppUserRepository repo) {}

    @Override
    public UserDetails loadUserByUsername(String username) {
        return User.withUsername(username)
                .password("password")
                .authorities("ROLE_USER")
                .build();
    }
}
