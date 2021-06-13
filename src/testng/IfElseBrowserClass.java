package testng;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;

public class IfElseBrowserClass {
	WebDriver driver;
//	String browser = "chrome";
	@Parameters({"browser"})
	@Test
	public void testcase(String browser) {
		if (browser.equals("chrome"))	{
			System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
			driver= new ChromeDriver(); 
		} else if (browser.equals("firefox")) {
			System.setProperty("webdriver.gecko.driver", "drivers/geckodriver.exe");
			driver = new FirefoxDriver(); 
		}
		
		driver.get("https://opensource-demo.orangehrmlive.com/");
		driver.quit();
	}


}
