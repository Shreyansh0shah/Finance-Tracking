package com.library.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.library.entity.User;
import com.library.security.JwtUtil;
import com.library.service.AuthService;

@RestController
@RequestMapping("/auth")
public class AuthController {
	
	
	@Autowired
	private AuthService authService;

    // Register API
    @PostMapping("/register")
    public User register(@RequestBody User user) {
        return authService.register(user);
    }

    // Login API
    @PostMapping("/login")
    public String login(@RequestBody User user) {
        User existingUser = authService.login(user.getUsername(), user.getPassword());

        if (existingUser != null) {
            return JwtUtil.generateToken(existingUser.getUsername());
        } else {
            return "Invalid credentials";
        }
    }


}
