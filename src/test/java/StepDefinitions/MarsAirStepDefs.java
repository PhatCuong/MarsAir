package StepDefinitions;

import io.cucumber.java.en.*;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class MarsAirStepDefs {

    public static WebDriver driver;

    @Given("user is on MarAir homepage")
    public void openMarsAirHomepage(){
        WebDriverManager.chromedriver().setup();
        driver = new FirefoxDriver();

//        driver.manage().window().maximize();
        driver.get("https://marsair.recruiting.thoughtworks.net/NguyenCuongPhat");

        System.out.println("MarsAir webpage is started!");
    }

    @When("user selects departure time is {string}")
    public void setDepartureTime(String departure){
        Select departureDropdown = new Select(driver.findElement(By.id("departing")));
        departureDropdown.selectByVisibleText(departure);
        System.out.println(departure + " is selected as departure time");
    }

    @And ("user selects returning time is {string}")
    public void setReturnTime(String returnTime){
        Select departureDropdown = new Select(driver.findElement(By.id("returning")));
        departureDropdown.selectByVisibleText(returnTime);
        System.out.println(returnTime + " is selected as departure time");
    }

    @And ("user adds promotional code is {string}")
    public void setPromotionalCode(String promotionalCode){
        driver.findElement(By.id("promotional_code")).sendKeys(promotionalCode);
        System.out.println("Promotional code is added to the list");
    }

    @Then("user clicks on search")
    public void clickSearch(){
        driver.findElement(By.xpath("//input[@type='submit']")).click();

        System.out.println("Click on Search");
    }

    @And("user get result for the flight is {string}")
    public void flightResult(String result){
        String content = driver.findElement(By.xpath("/html/body/div[1]/div/p[1]")).getText();

        Assert.assertEquals(result, content);
        System.out.println("Result matches");
    }

    @And("user get status of the promotional code is {string}")
    public void promotionalCodeStatus(String promotionalCodeStatus){
        String status = driver.findElement(By.xpath("/html/body/div[1]/div/p[2]")).getText();
        Assert.assertEquals(promotionalCodeStatus, status);
        System.out.println(status);
    }
}
