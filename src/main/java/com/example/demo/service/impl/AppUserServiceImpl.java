package com.example.demo.service.impl;

import com.example.demo.entity.AppUser;
import com.example.demo.entity.Role;
import com.example.demo.repository.AppUserRepository;
import com.example.demo.service.AppUserService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AppUserServiceImpl implements AppUserService {

    private final AppUserRepository userRepository;

    public AppUserServiceImpl(AppUserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Override
    public AppUser createUser(AppUser user) {
        user.setActive(true);
        user.setRole(Role.USER);   // ✅ enum usage
        return userRepository.save(user);
    }

    @Override
    public List<AppUser> getAllUsers() {
        return userRepository.findAll();
    }
}
