package com.example.demo.entity;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class AppUser {

    @Id
    @GeneratedValue
    private Long id;

    private String username;

    @Enumerated(EnumType.STRING)
    private Role role;

    private boolean active;
}
