package com.example.demo.service.impl;

import com.example.demo.entity.AppUser;
import com.example.demo.service.AppUserService;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class AppUserServiceImpl implements AppUserService {

    private final List<AppUser> users = new ArrayList<>();

    @Override
    public AppUser registerUser(AppUser user) {
        users.add(user);
        return user;
    }

    @Override
    public List<AppUser> getAllUsers() {
        return users;
    }
}
