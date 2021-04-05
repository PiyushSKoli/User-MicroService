package com.user.micro.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.user.micro.dto.LoginDto;
import com.user.micro.entity.Users;
import com.user.micro.service.UserService;

@RestController
@RequestMapping(value="/user")
public class UserController {

	@Autowired
	private UserService userService;
	
	@GetMapping("/getAllUsers")
	public List<Users> getAllUsers(){
		return userService.getAllUsers();
	}
	
	@PostMapping("/saveUser")
	public Users saveUser(@RequestBody Users user) {
		return userService.saveUser(user);
	}
	
	@PostMapping("/login")
	public LoginDto login(@RequestBody LoginDto login) {
		return userService.login(login);
	}
	
}
