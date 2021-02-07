package com.example.JavaSpringBoot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class JavaSpringBootApplication {

	public static void main(String[] args) {
		SpringApplication.run(JavaSpringBootApplication.class, args);
	}

	// http://localhost:8081/hello?name=Anish
	@GetMapping("/hello")
	public String hello(@RequestParam(value = "name", defaultValue = "World") String name) {
		return String.format("Hello %s!", name);
	}

	@RequestMapping("/")
	public String home() {
		return "<h1>Spring Boot App!</h1>	";
	}

}
