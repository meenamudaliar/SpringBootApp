package com.service;

import org.springframework.stereotype.Service;

@Service
public class UserService {
	public boolean loginValid(String name,String password) {
		if(name.equals("admin") && password.equals("manager")) {
			
			return true;
		}
		
		return false;
	}
}
