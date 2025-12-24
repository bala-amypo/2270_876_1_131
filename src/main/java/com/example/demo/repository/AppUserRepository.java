package com.example.demo.repository;

import com.example.demo.entity.AppUser;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository   // ⭐ REQUIRED
public interface AppUserRepository {
    Optional<AppUser> findByEmail(String email);
}
