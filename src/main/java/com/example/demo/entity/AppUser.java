package com.example.demo.entity;

import jakarta.persistence.*;

@Entity
public class AppUser {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String email;
    private String password;
    private boolean active;

    @Enumerated(EnumType.STRING)
    private Role role;

    public AppUser() {}

    public Long getId() { return id; }
    public String getEmail() { return email; }
    public String getPassword() { return password; }
    public boolean isActive() { return active; }
    public Role getRole() { return role; }

    public void setId(Long id) { this.id = id; }
    public void setEmail(String email) { this.email = email; }
    public void setPassword(String password) { this.password = password; }
    public void setActive(boolean active) { this.active = active; }
    public void setRole(Role role) { this.role = role; }
}
