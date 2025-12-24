package com.example.demo.entity;

import lombok.*;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class AppUser {

    private Long id;
    private String email;
    private String password;

    @Builder.Default
    private Boolean active = true;

    private Role role;
}
