package com.example.demo.security;

import org.springframework.security.authentication.AbstractAuthenticationToken;
import org.springframework.security.core.GrantedAuthority;

import java.util.Collection;

/**
 * Custom Authentication token for JWT
 */
public class JwtAuthenticationToken extends AbstractAuthenticationToken {

    private final Object principal;
    private final String token;

    // Constructor before authentication
    public JwtAuthenticationToken(String token) {
        super(null);
        this.principal = null;
        this.token = token;
        setAuthenticated(false);
    }

    // Constructor after authentication
    public JwtAuthenticationToken(
            Object principal,
            String token,
            Collection<? extends GrantedAuthority> authorities) {

        super(authorities);
        this.principal = principal;
        this.token = token;
        setAuthenticated(true);
    }

    @Override
    public Object getCredentials() {
        return token;
    }

    @Override
    public Object getPrincipal() {
        return principal;
    }
}
