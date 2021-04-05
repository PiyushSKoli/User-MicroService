package com.user.micro.entity;

import java.sql.Date;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Document(collection = "users")
public class Users {

	@Id
	private String employeeId;
	
	private String name;
	
	private String surname;
	
	private String email;
	
	private String password;
	
	private String role;
	
	private String designation;
	
	private String city;
	
	private Integer contact;
	
}
