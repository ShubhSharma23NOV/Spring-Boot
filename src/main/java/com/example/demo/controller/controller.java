package com.example.demo.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class controller{
	@RequestMapping("/GetName")
	public String getName() {
		return "Shubh Sharma";
	}
	@RequestMapping("/GetId")
	public int getId() {
		return 66;
	}
	@RequestMapping("/Info")
	public String getInfo() {
		return "Name=> "+getName()+" and Id=> "+getId();
	}
	@RequestMapping("/Info-2")
	public String getOtherInfo(@RequestParam("un") String un, @RequestParam("id") int id) {
	    return "Name => " + un + " and Id => " + id;
	}
}