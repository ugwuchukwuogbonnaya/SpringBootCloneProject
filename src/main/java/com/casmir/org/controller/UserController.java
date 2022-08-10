package com.casmir.org.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/user")
public class UserController {
	
	public String home() {
		
		return "Welcome To HOME PAGE";
	}
	
	
	public String dashboard() {
		
	return "Welcome To DASHBOARD PAGE";
		
	}

}
