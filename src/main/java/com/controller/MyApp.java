package com.controller;

import java.util.ArrayList;

import javax.swing.text.Keymap;

import org.apache.catalina.mapper.Mapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.model.User;
import com.service.UserService;



@RestController
@RequestMapping("/myapp")
public class MyApp {
	@Autowired
	private UserService us;
	
	ArrayList<User> al= new ArrayList<User>();
	@GetMapping(value="welcome")
	public String sayWelcome() {
	return "welcome to my application";
}
	
	@PostMapping(value="/login")
	
public String loginValid(@RequestParam("uname")String name,@RequestParam("pass")String pass) {
	
		
		if(us.loginValid(name, pass)) {
			return " login success";
		}
		map.put("errorMessage","login failed");
			return "login failure";
		}
		
	
	@PostMapping(value="/register")
	
	
public String registerUser(@RequestParam("txt1")String name,@RequestParam("txt2")String pass,@RequestParam("txt3")String email,@RequestParam("txt4")String city) {
		
		al.add(new User(name, pass, email, city));
		System.out.println(al);
		return "user register successfully";
}
	
}
