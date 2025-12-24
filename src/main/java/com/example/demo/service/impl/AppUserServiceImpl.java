package com.example.demo.service.impl;

import com.example.demo.entity.AppUser;
import com.example.demo.entity.Role;
import com.example.demo.service.AppUserService;
import org.springframework.stereotype.Service;

@Service
public class AppUserServiceImpl implements AppUserService {

    @Override
    public AppUser createUser(String email, String password) {
        AppUser user = new AppUser();
        user.setEmail(email);
        user.setPassword(password);
        user.setActive(true);
        user.setRole(Role.ROLE_USER);
        return user;
    }
}
