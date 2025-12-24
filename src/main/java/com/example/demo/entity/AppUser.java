package com.example.demo.entity;

public class AppUser {

    private Long id;
    private String email;
    private String password;
    private boolean active;
    private Role role;

    public AppUser() {}

    public AppUser(Long id, String email, String password, boolean active, Role role) {
        this.id = id;
        this.email = email;
        this.password = password;
        this.active = active;
        this.role = role;
    }

    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }

    public String getEmail() { return email; }
    public void setEmail(String email) { this.email = email; }

    public String getPassword() { return password; }
    public void setPassword(String password) { this.password = password; }

    public boolean getActive() { return active; }
    public void setActive(boolean active) { this.active = active; }

    public Role getRole() { return role; }
    public void setRole(Role role) { this.role = role; }
}
