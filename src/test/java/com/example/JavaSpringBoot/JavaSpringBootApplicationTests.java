package com.example.JavaSpringBoot;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.web.server.LocalServerPort;

@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.DEFINED_PORT)
class JavaSpringBootApplicationTests {


	@LocalServerPort
	private int port;


	@Test
	void contextLoads() {
		System.out.println("Test");
	}

	@Test
	public void simpleSeleniumTest() {
		WebDriver driver = null;
		driver = new ChromeDriver();
		driver.get("http://localhost:" + port);
		driver.navigate().to("http://localhost:" + port + "/hello");
		System.out.println("Inside selenium test");
		driver.quit();

	}

}
