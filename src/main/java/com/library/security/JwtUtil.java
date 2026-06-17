package com.library.security;

import io.jsonwebtoken.*;
import io.jsonwebtoken.security.Keys;
import org.springframework.stereotype.Component;

import java.security.Key;
import java.util.Date;

@Component
public class JwtUtil {

    private static  final String SECRET_KEY = "mysecretkeymysecretkeymysecretkey"; // 🔥 min 32 chars
    private static final Key key = Keys.hmacShaKeyFor(SECRET_KEY.getBytes());

    public static  String generateToken(String email) {
        return Jwts.builder()
                .setSubject(email)
                .setIssuedAt(new Date())
                .setExpiration(new Date(System.currentTimeMillis() + 1000 * 60 * 60)) // 1 hour
                .signWith(key, SignatureAlgorithm.HS256) // ✅ FIXED
                .compact();
    }


    public  static String  validateToken(String token) {
        return Jwts.parserBuilder() // ✅ FIXED
                .setSigningKey(key) // ✅ FIXED
                .build()
                .parseClaimsJws(token)
                .getBody()
                .getSubject();
    }
}
