package xpath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class XpathClass {
	WebDriver driver;
	
	@Test
	public void setup() {
		System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/");
		driver.manage().window().maximize();
		
//		CSS = tagname[attribute=value]
		driver.findElement(By.cssSelector("input[id='txtUsername']")).sendKeys("ABC");
		
//	    Dynamic Xpath
		driver.findElement(By.xpath("//*[text()='LOGIN Panel']")).getText();
//		login button = //*[text()='LOGIN Panel']//following::input[3]
//		username = //input[@id='btnLogin']//preceding::input[2]
//		//*[contains(text(),'LOGIN Panel')]
//		//div[starts-with(text(),'LOGIN')]
	}


}
