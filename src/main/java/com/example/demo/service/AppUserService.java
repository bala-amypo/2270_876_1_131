package com.example.demo.service;

import com.example.demo.entity.AppUser;

import java.util.List;

public interface AppUserService {
    AppUser registerUser(AppUser user);
    List<AppUser> getAllUsers();
}
