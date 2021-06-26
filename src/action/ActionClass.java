package action;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class ActionClass {
  @Test
  public void testMethod() {
		String url = "https://www.travolook.in/?gclid=Cj0KCQjw4cOEBhDMARIsAA3XDRjGAeFHS8cqdKjY45Sc7ZEf98H63uG7bP6HsxGr9ugbNNNMU0GJZdYaAoH4EALw_wcB";   // locally
		System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		
		driver.get(url);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		
		Actions action = new Actions(driver);
		WebElement support = driver.findElement(By.xpath("(//a[@title='Contact us'])[2]"));
		action.moveToElement(support)
		.build()
		.perform();
		
		WebElement cancel = driver.findElement(By.xpath("(//a[text()='Cancel/Reschedule'])[1]"));
		cancel.click();
		
  }
}




