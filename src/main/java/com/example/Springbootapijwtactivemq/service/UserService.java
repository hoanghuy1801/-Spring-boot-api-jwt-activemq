package com.example.Springbootapijwtactivemq.service;

import com.example.Springbootapijwtactivemq.auth.UserPrincipal;
import com.example.Springbootapijwtactivemq.entity.User;

public interface UserService {
	User createUser(User user);
	UserPrincipal findByUsername(String username);
}
