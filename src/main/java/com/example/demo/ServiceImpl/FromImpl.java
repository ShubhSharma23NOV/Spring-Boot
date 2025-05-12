package com.example.demo.ServiceImpl;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.UserService.FormService;
import com.example.demo.entity.User1;
import com.example.demo.exception.UserNotFoundException;
import com.example.demo.repository.UserRepo1;

@Service
public class FromImpl implements FormService{
	@Autowired
	private UserRepo1 u1;
	@Override
	public User1 regis(User1 user) {
		return u1.save(user);
	}
	@Override
	public User1 login(String id) {
	User1 us=u1.findById(id).get();
	if(us!=null) return us;
	throw new UserNotFoundException("User not found");
	}
}
