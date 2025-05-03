package com.example.demo.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RequestControllerApi{
	@RequestMapping("/PathVar-test-2/{id}")
	public String test2(@PathVariable String id) {
		List<String> li=new ArrayList<>();
		li.add("Emp-1");
		li.add("Emp-2");
		li.add("Emp-3");
		li.add("Emp-4");
		li.add("Emp-5");
		for(String s:li){
			if(s.equals(id)) return s;
		}
		return "";	
	}
	
}