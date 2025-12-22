package com.example.demo.controller;

import com.example.demo.dto.AuthRequest;
import com.example.demo.entity.AppUser;
import com.example.demo.service.AppUserService;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/auth")
public class AuthController {

    private final AppUserService userService;

    public AuthController(AppUserService userService) {
        this.userService = userService;
    }

    @PostMapping("/register")
    public AppUser register(@RequestBody AuthRequest request) {
        AppUser user = AppUser.builder()
                .id(System.currentTimeMillis())
                .email(request.getEmail())
                .password(request.getPassword())
                .role("USER")
                .build();
        return userService.createUser(user);
    }

    @PostMapping("/login")
    public String login(@RequestBody AuthRequest request) {
        AppUser user = userService.getUserByEmail(request.getEmail());
        if (user != null && user.getPassword().equals(request.getPassword())) {
            return "Login successful";
        } else {
            return "Invalid credentials";
        }
    }
}
