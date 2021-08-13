package StepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;


public class GoogleSearchSteps {

    WebDriver driver = null;

    @Given("User is on Google Search Page")
    public void user_is_on_google_search_page() {
        System.out.println("Opening Browser...");
        System.out.println("Project Path: " + System.getProperty("user.dir"));
        //driver setup
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        // driver = new ChromeDriver(); // assumes chrome driver is setup and is in Path var
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
        driver.manage().window().maximize();

        driver.get("http://www.google.com");
        System.out.println("User is on search page");
    }

    //    example of passing search term using parameter with regex
    @When("^I enter (.*) in box$")
    public void i_enter_search_term_in_box(String searchterm) {

        driver.findElement(By.name("q")).sendKeys(searchterm);

    }

    @When("I click on Search button")
    public void i_click_on_search_button() {

        driver.findElement(By.name("q")).sendKeys(Keys.ENTER);

    }

    @Then("Show Results")
    public void show_results() throws InterruptedException {
        System.out.println("Showing results");

        Thread.sleep(2);
        driver.close();
        driver.quit();
        System.out.println("Closed Browser");
    }


}
