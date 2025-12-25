package com.example.demo.controller;

import com.example.demo.entity.AppUser;
import com.example.demo.service.AppUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/auth")
public class AuthController {

    @Autowired
    private AppUserService userService;

    @PostMapping("/register")
    public AppUser register(@RequestBody AppUser user) {
        return userService.registerUser(user);
    }
}
