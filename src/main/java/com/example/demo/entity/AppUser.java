package com.example.demo.entity;
j u j
import jakarta.persistence.*;
import java.util.Set;

@Entity
@Table(
    // name = "app_users", 
    uniqueConstraints = @UniqueConstraint(columnNames = "email")
    )
public class AppUser {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false, unique = true)
    private String email;

    @Column(nullable = false)
    private String password;

    @ElementCollection(fetch = FetchType.EAGER)
    @Enumerated(EnumType.STRING)
    private Set<Role> roles;

    private Boolean active = true;

    public AppUser() {}

    public AppUser(String email, String password, Set<Role> roles, Boolean active) {
        this.email = email;
        this.password = password;
        this.roles = roles;
        this.active = active;
    }


    public Long getId() { 
        return id; 
    }

    public String getEmail() { 
        return email; 
    }

    public void setEmail(String email) { 
        this.email = email; 
    }

    public String getPassword() { 
        return password; 
    }

    public void setPassword(String password) { 
        this.password = password; 
    }

    public Set<Role> getRoles() { 
        return roles; 
    }

    public void setRoles(Set<Role> roles) { 
        this.roles = roles; 
    }

    public Boolean getActive() { 
        return active; 
    }

    public void setActive(Boolean active) { 
        this.active = active; 
    }
}
