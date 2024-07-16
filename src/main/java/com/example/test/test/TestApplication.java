package com.example.test.test;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;



@SpringBootApplication
@RestController
public class TestApplication {

	@GetMapping("/message")
	public String message(){
		return "Kent";
	}

	public static void main(String[] args) {
		SpringApplication.run(TestApplication.class, args);
	}

}
