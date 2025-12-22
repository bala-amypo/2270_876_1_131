package com.example.demo.service.impl;

import com.example.demo.entity.AppUser;
import com.example.demo.service.AppUserService;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;

@Service
public class AppUserServiceImpl implements AppUserService {

    private final Map<String, AppUser> users = new HashMap<>();

    @Override
    public AppUser createUser(AppUser user) {
        users.put(user.getEmail(), user);
        return user;
    }

    @Override
    public AppUser getUserByEmail(String email) {
        return users.get(email);
    }
}
