package SeleniumAssignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LocatorByID {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();  //Launch Chrome
		//driver.get("https://app.hubspot.com/login"); // Launch URL
		driver.get("https://www.facebook.com"); // Launch URL
		
		Thread.sleep(5000);
		
		//Locators preference
		//1. id  (Best locator)
		//2. name
		//3. Xpath, CSSSelector
		//4. Class Name
		
		//LinkText and PartialLinkText  is only for links
		//TagName is generally used to find the total number of links on that page
		
		//1. id
		
//		driver.findElement(By.id("email")).sendKeys("test456@gmail.com");
//		driver.findElement(By.id("pass")).sendKeys("test456");
//		driver.findElement(By.id("u_0_b")).click();
		
		//Preferable way of writing the code
		
		//Creating the Webelement
	WebElement email = 	driver.findElement(By.id("email"));
	WebElement password = driver.findElement(By.id("pass"));
	WebElement loginBtn = driver.findElement(By.id("u_0_b"));
	
	//Passing the text or Perform actions on it
	email.sendKeys("test123456@gmail.com");
	password.sendKeys("test123456");
	loginBtn.click();
	
	email.sendKeys("test6789@gmail.com");
	password.sendKeys("test678$");
	loginBtn.click();
	
	}

}
