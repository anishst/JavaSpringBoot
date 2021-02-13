package com.example.JavaSpringBoot;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertEquals;

//@SpringBootTest, which will make the test a Spring Boot-driven test. This means that the test context
// framework will be searching for the class annotated with @SpringBootApplication (if no specific configuration
// is passed) and will use that to actually start the application.

@SpringBootTest
class WebTests {

	@BeforeEach
	void setUp() {
		System.out.println("Setup Needed for app");
	}

	@AfterEach
	void tearDown() {
		System.out.println("Cleaning up");
	}

	@Test
	void contextLoads() {
		System.out.println(" ****Testing contextLoads ********");
	}
	@Test
	void HelloWorld() {
		System.out.println(" ****Hello world! I am a test!********");
	}

	@Test
	void newpage() {
		assertEquals("Hello", "Hello");
		JavaSpringBootApplication newpage = new JavaSpringBootApplication();
		String result = newpage.newpage();
		assertEquals("I am a new page", result);
	}

}
