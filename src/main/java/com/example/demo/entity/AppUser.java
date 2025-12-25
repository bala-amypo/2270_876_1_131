package com.example.demo.entity;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class AppUser {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String email;
    private String password;

    private String role; // Use String for simplicity
    private Boolean active;

    // If you need convenience setters for tests
    public void setActive(boolean active) {
        this.active = active;
    }
}
