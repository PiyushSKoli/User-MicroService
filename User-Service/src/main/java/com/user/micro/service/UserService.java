package com.user.micro.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.user.micro.dto.LoginDto;
import com.user.micro.entity.Users;
import com.user.micro.repository.UserRepository;

@Service
public class UserService {

	@Autowired
	private UserRepository userRepository;
	
	public List<Users> getAllUsers(){
		return userRepository.findAll();
	}
	
	public Users saveUser(Users user) {
		user.setRole("User");
		return userRepository.save(user);
	}
	
	public LoginDto login(LoginDto loginDto) {
		Users user=userRepository.findByEmailAndPasswordAndRole(loginDto.getEmail(),loginDto.getPassword(),loginDto.getRole());
		LoginDto dto=new LoginDto();
		if(user!= null) {
			dto.setEmail(loginDto.getEmail());
			dto.setPassword(loginDto.getPassword());
			dto.setRole(user.getRole());
			dto.setMsg("Login Successfully");
		}else {
			dto.setEmail(loginDto.getEmail());
			dto.setPassword(loginDto.getPassword());
			dto.setRole(null);
			dto.setMsg("Login Faild");
		}
		return dto;
	}
}
