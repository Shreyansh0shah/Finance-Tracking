package com.library.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.library.entity.User;
import com.library.repository.UserRepository;

@Service 
public class AuthService {
	
	@Autowired
	private UserRepository userRepo;
	
	public User register(User user) {
		return userRepo.save(user);
		
	}
	public User login(String username, String password) {
		User user=userRepo.findByUsername(username).orElse(null);
		
		if(user !=null && user.getPassword().equals(password)) {
			return user;
		}
		return null;
	}

} 
