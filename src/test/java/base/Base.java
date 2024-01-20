package base;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.github.bonigarcia.wdm.WebDriverManager;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class Base extends AbstractTestNGCucumberTests {
	
	public static ChromeDriver driver;

	public String readConfig(){

		Properties properties = new Properties();

		try {
			FileInputStream fis = new FileInputStream("src/test/resources/config.properties");
			properties.load(fis);

		} catch (FileNotFoundException e) {
			throw new RuntimeException(e);
		} catch (IOException e) {
			throw new RuntimeException(e);
		}

		return properties.getProperty("database.url");


	}
	
	/*
	 * @BeforeMethod public void pre() {
	 * 
	 * WebDriverManager.chromedriver().setup(); driver = new ChromeDriver(); }
	 */
	
	/*
	 * @AfterMethod public void post() { driver.close(); }
	 */

}
