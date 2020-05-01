package SeleniumSessions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ExplicitlyWaitConcept {

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();  //Launch Chrome
		
		driver.get("https://app.hubspot.com/login"); // Launch URL
		
//		//Explicitly wait for Browser Actions
//		WebDriverWait wait = new WebDriverWait(driver,3);   //will keep trying for every 500 msec
//		wait.until(ExpectedConditions.titleIs("HubSpot Login"));   //Explicitly Wait  will wait till the title is "HubSpot Login" within 3 seconds
//		
//		System.out.println(driver.getTitle());  
		
		
		//Explicit wait for WebElements
		
		WebDriverWait wait = new WebDriverWait(driver,6);   //will keep trying for every 500 msec
		wait.until(ExpectedConditions.presenceOfElementLocated(By.id("username")));   ///
		
		
		WebElement emailID = driver.findElement(By.id("username"));
		emailID.sendKeys("swathi@gmail.com");
		
		//no need to apply Explicitly wait for all elements as WebElemnts have been displayed by the time username is displayed
		WebElement password = driver.findElement(By.id("password"));
		password.sendKeys("123456");
		
		WebElement loginBtn = driver.findElement(By.id("loginBtn"));
		loginBtn.click();
		
		
		
	}

}
