package com.example.JavaSpringBoot;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.context.SpringBootTest.WebEnvironment;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.boot.web.server.LocalServerPort;

import static org.assertj.core.api.Assertions.assertThat;

// https://spring.io/guides/gs/testing-web/
@SpringBootTest(webEnvironment = WebEnvironment.RANDOM_PORT)
public class HttpRequestTest {

    @LocalServerPort
    private int port;

    @Autowired
    private TestRestTemplate restTemplate;

    @Test
    public void greetingShouldReturnDefaultMessage() throws Exception {
        assertThat(this.restTemplate.getForObject("http://localhost:" + port + "/hello",
                String.class)).contains("Hello");
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