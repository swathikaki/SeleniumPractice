package SeleniumSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class UserActions {

	public static void main(String[] args) throws InterruptedException {
		

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();  //Launch Chrome
		//driver.get("https://www.app.hubspot.com/login"); // Launch URL
		driver.get("https://app.hubspot.com/login"); // Launch URL
		
		Thread.sleep(5000);
		
		WebElement emailID = driver.findElement(By.id("username"));
		WebElement password = driver.findElement(By.id("password"));
		WebElement loginBtn = driver.findElement(By.id("loginBtn"));
		
		Actions action = new Actions(driver);
		
		action.sendKeys(emailID, "swathi@gmail.com");
		action.sendKeys(password, "1234");
		action.click(loginBtn).perform();  //
		
		
		
		
		
		
		
	}

}
