package hooks;

import org.openqa.selenium.chrome.ChromeDriver;

import base.Base;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.github.bonigarcia.wdm.WebDriverManager;


public class Hooks extends Base {
	
	@Before
	public void precondition() {
		System.out.println("Inside Before");
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
	}
	
	@After 
	public void postcondition() {
		
		System.out.println("Inside After");
		driver.close();
	}

}
