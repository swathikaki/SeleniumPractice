package SeleniumSessions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ImpWaitForBrowserProperties {

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();  //Launch Chrome
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);  //Implict wait, Global wait, dynamic wait
		
		driver.get("https://app.hubspot.com/login"); // Launch URL
		//Thread.sleep(5000);   //Static wait or Constant wait
		
		WebElement emailID = driver.findElement(By.id("username"));
				emailID.sendKeys("swathi@gmail.com");
		
		System.out.println(driver.getTitle());  //Checking Browser as title as page is not loaded yet, //Implicit wait will not work for Browser
		//properties
		

	}

}
