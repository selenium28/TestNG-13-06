package testng;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class DemoClass {
	String currentTitle = "Facebook";
	WebDriver driver;

	@Test(priority = 1)
	public void validLogin() {
		driver.findElement(By.id("txtUsername")).sendKeys("Admin");
		driver.findElement(By.name("txtPassword")).sendKeys("admin123");
		driver.findElement(By.id("btnLogin")).click();    
		String actualTitle = "OrangeHRM";
		String expectedTitle = driver.getTitle();
		Assert.assertEquals(actualTitle, expectedTitle);
		
	}

	@Test(priority = 0)
	public void invalidLogin() {
		driver.findElement(By.id("txtUsername")).sendKeys("Admin");
		driver.findElement(By.name("txtPassword")).sendKeys("admin12563");
		driver.findElement(By.id("btnLogin")).click();
		String actualTitle = "Invalid credentialhjg";
		String expectedTitle = driver.findElement(By.xpath("//span[text()='Invalid credentials']")).getText();
		Assert.assertEquals(actualTitle, expectedTitle);
	}
	
	@Test(priority = 3)
	public void invalidBlank() {
		driver.findElement(By.id("txtUsername")).sendKeys("  ");
		driver.findElement(By.name("txtPassword")).sendKeys("g ");
		driver.findElement(By.id("btnLogin")).click();
		String actualTitle = "Invalid credentialshjdfh";
		String expectedTitle = driver.findElement(By.xpath("//span[text()='Invalid credentials']")).getText();
		Assert.assertEquals(actualTitle, expectedTitle);
	}
	
	@BeforeMethod
	public void setup() {
		System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/");
		driver.manage().window().maximize();

	}

	@AfterMethod
	public void tearDown() {
		driver.quit();

	}


}
