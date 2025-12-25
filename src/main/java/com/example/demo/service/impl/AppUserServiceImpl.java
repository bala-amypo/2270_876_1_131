package com.example.demo.service.impl;

import com.example.demo.entity.AppUser;
import com.example.demo.entity.Role;
import com.example.demo.repository.AppUserRepository;
import com.example.demo.service.AppUserService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AppUserServiceImpl implements AppUserService {

    private final AppUserRepository repository;

    public AppUserServiceImpl(AppUserRepository repository) {
        this.repository = repository;
    }

    @Override
    public AppUser registerUser(AppUser user) {
        user.setActive(true);
        user.setRole(Role.USER);
        return repository.save(user);
    }

    @Override
    public List<AppUser> getAllUsers() {
        return repository.findAll();
    }
}
