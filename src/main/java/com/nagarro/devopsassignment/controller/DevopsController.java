package com.nagarro.devopsassignment.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DevopsController {
	
	@GetMapping("/test")
    public String getTest() { 
		return "Working";
	}


}
