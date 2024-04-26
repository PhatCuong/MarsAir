package StepDefinitions;

import io.cucumber.java.en.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class LoginStepDef {

    WebDriver driver = null;

    @Given("user is on MarAir homepage")
    public void user_is_on_MarAir_homepage(){
        System.setProperty("webdriver.chrome.driver", "/Users/user/Documents/Automation/MarAirAutomation/MarsAir/src/test/resources/Driver/chromedriver");

        driver = new ChromeDriver();

        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);

//        driver.manage().window().maximize();

        System.out.println("User is at MarAir homepage");
    }

    @When("user sees the homepage")
    public void see_homepage(){

        System.out.println("User is at MarAir homepage");
    }

    @Then("finish everything")
    public void finish_everything(){

        System.out.println("User is at MarAir homepage");
    }
}
