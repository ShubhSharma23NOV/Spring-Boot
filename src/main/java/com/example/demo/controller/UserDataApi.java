package com.example.demo.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.ServiceImpl.ServiceImpl;
import com.example.demo.entity.User;

@RestController
public class UserDataApi{
	@Autowired
	ServiceImpl impl;
		@RequestMapping("/UserData2")
		public String User(@RequestBody User user){
			user=impl.createUser(user);
			return user.toString();
		}
	}
