package com.example.demo.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class User1 {
	@Column
	private String name;
	@Column
	private String userName;
	@Column
	private String password;
	@Id
	private String id;
	
	@Override
	public String toString() {
		return "User [Name=" + name + ", userName=" + userName + ", password=" + password + ", id=" + id + "]";
	}
	public User1() {}
	public User1(String name, String userName, String password) {
		super();
		this.name = name;
		this.userName = userName;
		this.password = password;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String Name) {
		this.name = Name;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
}
