package com.example.demo.UserService;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.demo.entity.User;
@Service
public interface Crud {
	public User createUser(User user);
	public List<User> allUser();
	public User updateUser(String id,User user);
	public User deleteUser(String id);
}
