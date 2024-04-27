package com.javainuse.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.javainuse.Entity.UserData;
import com.javainuse.Repo.UserDataRepo;

@RestController
@CrossOrigin()
public class HelloWorldController {
	
	@Autowired
	private UserDataRepo userData;
	
	@Autowired
	private PasswordEncoder bcryptEncoder;

	@RequestMapping({ "/hello" })
	public String hello() {
		return "Hello World";
	}
	
	@PostMapping("/post")
	public String putUserData(@RequestBody UserData user)
	{
		System.out.println(user);
		user.setPassword(bcryptEncoder.encode(user.getPassword()));

		userData.save(user);
		
		return "data insert";
		
	}

}
