
package stepdefinitions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.When;

public class LoginTest {

	public ChromeDriver driver;

	/*
	 * @Given("Navigate to url")
	 * 
	 * public void url() {
	 * 
	 * WebDriverManager.chromedriver().setup(); driver = new ChromeDriver();
	 * driver.get("http://leaftaps.com/opentaps/control/main");
	 * driver.manage().window().maximize();
	 * 
	 * }
	 */
	@When("Enter Username")
	public void enterUsername() {

		WebElement element = driver.findElement(By.xpath("//input[@id='username']"));
		element.sendKeys("DemoCSR");

	}

	@And("Enter Password")
	public void enterPassword() {
		WebElement element = driver.findElement(By.xpath("//input[@id='password']"));
		element.sendKeys("crmsfa");
	}

	/*
	 * @Then("Logged in successfully") public void enterLogin() { WebElement element
	 * = driver.findElement(By.xpath("//input[@class='decorativeSubmit']"));
	 * element.click(); }
	 */

}
