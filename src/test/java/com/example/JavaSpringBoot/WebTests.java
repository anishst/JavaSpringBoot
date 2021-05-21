package com.example.JavaSpringBoot;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.context.SpringBootTest.WebEnvironment;
import org.springframework.boot.web.server.LocalServerPort;

import java.util.concurrent.TimeUnit;

import static org.junit.jupiter.api.Assertions.assertEquals;

//@SpringBootTest, which will make the test a Spring Boot-driven test. This means that the test context
// framework will be searching for the class annotated with @SpringBootApplication (if no specific configuration
// is passed) and will use that to actually start the application.

@SpringBootTest(webEnvironment = WebEnvironment.RANDOM_PORT)
class WebTests {

	WebDriver driver = null;

	@LocalServerPort
	private int port;

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

	@Test
	public void user_is_on_application_homepage() throws InterruptedException {


		System.out.println("Opening Browser...");
		System.out.println("Project Path: " + System.getProperty("user.dir"));
		//driver setup
		if (System.getenv("CLOUD_RUN_FLAG") == null) {
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
		}
		else {
			// use the chrome driver in docker instance
			WebDriverManager.chromedriver().setup();
			ChromeOptions options = new ChromeOptions();
			options.addArguments("--no-sandbox");
			options.addArguments("--headless");
			options.addArguments("--disable-dev-shm-usage");
			driver = new ChromeDriver(options);
		}
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
		driver.manage().window().maximize();

		driver.get("http://localhost:" + port);
		System.out.println("User is on search page");
		driver.findElement(By.xpath("//input")).click();
		Thread.sleep(5);
		driver.quit();
	}

}
