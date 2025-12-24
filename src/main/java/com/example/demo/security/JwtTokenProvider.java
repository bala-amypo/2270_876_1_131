package com.example.demo.security;

import com.example.demo.entity.AppUser;
import io.jsonwebtoken.*;
import io.jsonwebtoken.security.Keys;
import org.springframework.stereotype.Component;

import java.util.Date;

@Component   // ⭐ THIS IS THE FIX
public class JwtTokenProvider {

    private final byte[] key =
            "secretsecretsecretsecretsecret12".getBytes();

    public String createToken(AppUser user) {
        return Jwts.builder()
                .setSubject(user.getEmail())
                .claim("role", user.getRole())
                .claim("userId", user.getId())
                .setIssuedAt(new Date())
                .signWith(Keys.hmacShaKeyFor(key))
                .compact();
    }

    public boolean validateToken(String token) {
        getClaims(token);
        return true;
    }

    public Claims getClaims(String token) {
        return Jwts.parserBuilder()
                .setSigningKey(key)
                .build()
                .parseClaimsJws(token)
                .getBody();
    }
}
