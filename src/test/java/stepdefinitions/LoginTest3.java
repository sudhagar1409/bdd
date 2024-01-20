package stepdefinitions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import base.Base;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginTest3 extends Base {

    @Given("I am in url")
    public void iaminurl() {

        driver.get(readConfig());

    }

    @When("I am adding {string} and {string}")
    public void credentialAdding(String uName, String passwrd) {

        WebElement userName = driver.findElement(By.xpath("//input[@id='username']"));
        userName.sendKeys(uName);
        WebElement password = driver.findElement(By.xpath("//input[@id='password']"));
        password.sendKeys(passwrd);

    }

    @Then("I am seeing the new page on screen")
    public void pageNavifgation() {

        driver.findElement(By.xpath("//input[@class='decorativeSubmit']")).click();

    }

}
