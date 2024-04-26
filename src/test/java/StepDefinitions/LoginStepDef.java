package StepDefinitions;

import io.cucumber.java.en.*;
import org.openqa.selenium.WebDriver;

public class LoginStepDef {

    WebDriver driver = null;

    @Given("user is on MarAir homepage")
    public void user_is_on_MarAir_homepage(){

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
