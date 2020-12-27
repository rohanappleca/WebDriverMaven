package webdriverMaven;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LoginTest {

	
	public static WebDriver driver;
	
	@BeforeSuite
	public void setUp() {
		
		WebDriverManager.firefoxdriver().setup();
		driver=new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		
	}
	
	@Test
	public void login() {
		
		driver.get("http://google.com");
		
	}
	
	@AfterSuite
	public void tearDown() {
		
		driver.quit();
		
	}
}
