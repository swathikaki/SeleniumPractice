package SeleniumSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class StaleElementRefExecption {

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();  //Launch Chrome
		driver.get("https://classic.crmpro.com"); // Launch URL,  DOM Version1 will be loaded
		
		WebElement username = driver.findElement(By.name("username"));  
		username.sendKeys("Swathi");
		
		driver.navigate().refresh();  //new version V2 DOM will get loaded after refresh 
		//username.sendKeys("Hello");  //will give StaleElementReference Exception as the DOM is getting refreshed
		
		username = driver.findElement(By.name("username"));  //to avoid exception we need to findElement again after refresh to get the new version DOM element
		
		username.sendKeys("Hello");  //No StaleElementReference Exception as the DOM is getting refreshed and we are finding element again after refresh
		
		
		
	}

}
