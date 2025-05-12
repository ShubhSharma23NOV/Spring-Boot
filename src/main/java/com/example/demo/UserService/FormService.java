package com.example.demo.UserService;


import com.example.demo.entity.User1;

public interface FormService {
	public User1 regis(User1 user);
	User1 login(String id);
}
