package com.example.demo.service.impl;

import com.example.demo.entity.AppUser;
import com.example.demo.repository.AppUserRepository;
import com.example.demo.service.AppUserService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class AppUserServiceImpl implements AppUserService {

    private final AppUserRepository repository;

    @Override
    public AppUser createUser(AppUser user) {
        // Ensure user is active
        user.setActive(true);

        // If role is an object, convert to String
        if (user.getRole() != null) {
            user.setRole(user.getRole().toString());
        }

        return repository.save(user);
    }

    @Override
    public List<AppUser> getAllUsers() {
        return repository.findAll();
    }

    @Override
    public AppUser getUserById(Long id) {
        return repository.findById(id).orElse(null);
    }
}
