package com.example.demo.service;

import com.example.demo.entity.AppUser;

import java.util.List;

public interface AppUserService {

    AppUser createUser(AppUser user);

    List<AppUser> getAllUsers();

    AppUser getUserById(Long id);
}
