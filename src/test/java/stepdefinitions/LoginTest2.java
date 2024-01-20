package stepdefinitions;


import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class LoginTest2 {

    public ChromeDriver driver;

    @Given("Navigate to url")

    public void url() {

        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.get("http://leaftaps.com/opentaps/control/main");
        driver.manage().window().maximize();

    }

    @When("Enter Username as {string}")
    public void enterUsername(String username) {

        WebElement element = driver.findElement(By.xpath("//input[@id='username']"));
        element.sendKeys(username);

    }

    @And("Enter Password as {string}")
    public void enterPassword(String password) {
        WebElement element = driver.findElement(By.xpath("//input[@id='password']"));
        element.sendKeys(password);
    }

    @Then("Logged in successfully")
    public void enterLogin() {
        WebElement element = driver.findElement(By.xpath("//input[@class='decorativeSubmit']"));
        element.click();
    }

}
