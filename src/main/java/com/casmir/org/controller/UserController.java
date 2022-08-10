package com.casmir.org.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/user")
public class UserController {
	
	@GetMapping("/home")
	public String home() {
		
		return "Welcome To HOME PAGE";
	}
	
	
	@PostMapping("/dashboard")
	public String dashboard() {
		
	return "Welcome To DASHBOARD PAGE";
		
	}

}
