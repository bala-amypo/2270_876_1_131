package com.example.demo.security;

import com.example.demo.entity.AppUser;
import com.example.demo.exception.ResourceNotFoundException;
import com.example.demo.repository.AppUserRepository;

import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.*;

import java.util.List;

public class CustomUserDetailsService implements UserDetailsService {

    private final AppUserRepository userRepository;

    public CustomUserDetailsService(AppUserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Override
    public UserDetails loadUserByUsername(String username)
            throws UsernameNotFoundException {

        AppUser user = userRepository.findByEmail(username)
                .orElseThrow(() ->
                        new ResourceNotFoundException("User not found"));

        return User.builder()
                .username(user.getEmail())
                .password(user.getPassword())
                .disabled(!user.getActive())
                .authorities(
                        List.of(
                                new SimpleGrantedAuthority(
                                        user.getRole().name()
                                )
                        )
                )
                .build();
    }
}
