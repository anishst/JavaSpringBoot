package StepDefinitions;

import org.junit.runner.RunWith;

import io.cucumber.junit.CucumberOptions;
import io.cucumber.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/resources/Features",
        glue = {"StepDefinitions"},
        monochrome = true,
        //plug-in = {"pretty", "html:target/HtmlReports/test_report.html"}, // HTML report
        //plugin = {"pretty", "json:target/JSONReports/test_report.json"} // JSON report
        //plugin = {"pretty", "junit:target/XMLReports/test_report.xml"} // junit xml report
        plugin = {"pretty",
                "html:target/HtmlReports/test_report.html",
                "json:target/cucumber.json", // needs to under target folder for maven-cucumber-reporting to work
                "junit:target/XMLReports/test_report.xml"
        })
public class TestRunner {
}
