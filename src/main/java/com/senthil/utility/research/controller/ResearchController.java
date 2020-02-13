package com.senthil.utility.research.controller;

import org.springframework.web.bind.annotation.GetMapping;

public class ResearchController {

	@GetMapping("/find")
	public String dothis() {
		
		return "Welcome to the world of pcf";
	}
	
	
}
