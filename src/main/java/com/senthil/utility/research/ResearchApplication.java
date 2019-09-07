package com.senthil.utility.research;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class ResearchApplication {
	
	
	@GetMapping("/find")
	public String dothis() {
		return "Welcome to the world of micrservice";
	}

	public static void main(String[] args) {
		SpringApplication.run(ResearchApplication.class, args);
	}

}
