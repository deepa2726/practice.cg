package com.cg;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;

@SpringBootApplication
public class PracticeApplication {

	@GetMapping
	public String getMessage() {
		return "Hello World";
	}
	public static void main(String[] args) {
		SpringApplication.run(PracticeApplication.class, args);
	}

}
