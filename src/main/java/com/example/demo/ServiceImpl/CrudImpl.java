package com.example.demo.ServiceImpl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.example.demo.UserService.Crud;
import com.example.demo.entity.User;
import com.example.demo.exception.UserNotFoundException;

@Service
public class CrudImpl implements Crud{
		
	List<User> li=new ArrayList<>();
	@Override
	public User createUser(User user) {
		li.add(user);
		return user;
	}

	@Override
	public List<User> allUser() {
		return li;
	}

	@Override
	public User updateUser(String id, User user){
		for(User u:li){
			if(u.getId().equals(id)){
				u.setName(user.getName());
				u.setUserName(user.getUserName());
				return u;
			}
		}
		throw new UserNotFoundException("User with ID " + id + " not found.");
	}

	@Override
	public User deleteUser(String id) {
		for(User u:li){
			if(u.getId().equals(id)){
				li.remove(u);
				return u;
			}
		}
		throw new UserNotFoundException("User with ID " + id + " not found.");
	}
	
}
