package action;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class DragnDropClass {
	
  @Test
  public void dragMethod() throws InterruptedException {
	  String url = "https://jqueryui.com/droppable/"; 
		System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
		WebDriver driver= new ChromeDriver(); 
		driver.get(url);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		driver.switchTo().frame(0);
		
		WebElement drag = driver.findElement(By.id("draggable"));
		WebElement drop = driver.findElement(By.id("droppable"));
		
		Thread.sleep(5000);
		Actions act = new Actions(driver);
		act.clickAndHold(drag).moveToElement(drop).release().build().perform();
		System.out.println("Drag and Drop performed");
		
  }
}
