package com.example.demo.controller;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.demo.ServiceImpl.FromImpl;
import com.example.demo.entity.User1;

@Controller
public class ViewController {
	@Autowired
	private FromImpl f;
	@RequestMapping("/home")
	public String home() {
		return "index";
	}
	@RequestMapping("/Register")
	public String showRegistrationForm() {
	    return "Register"; 
	}

	@PostMapping("/Regis-handle")
	public String regis(@ModelAttribute User1 user) {
		f.regis(user);
		return "redirect:/Login";
	}
	@RequestMapping("/Login")
	public String showLoginForm() {
		return "Login";
	}
	@PostMapping("/Login-Handle")
	public String login(@ModelAttribute User1 user){
		f.login(user.getId());
		return "redirect:/home";
		
	}
}
