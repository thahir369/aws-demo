package com.helloWorld.awsdemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class AwsDemoApplication {


	@GetMapping("/")
	public String home(){
		return "<h2>hai, welcome to home page<h2>";
	}

	public static void main(String[] args) {
		SpringApplication.run(AwsDemoApplication.class, args);
	}

}
