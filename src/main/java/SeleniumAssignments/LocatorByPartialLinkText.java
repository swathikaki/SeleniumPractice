package SeleniumAssignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LocatorByPartialLinkText {

	public static void main(String[] args) throws InterruptedException {
		
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();  //Launch Chrome
		driver.get("https://app.hubspot.com/login"); // Launch URL
		
		Thread.sleep(5000);
		
		//4. partialLinkText, works only for links
		//Link is always represented by "a" tag
		//Sign Up, Sign in are present, app will select first available sign and click
		//PartialLinkText is not a good idea to use in case if multiple links are present with same name
		
		WebElement button = driver.findElement(By.partialLinkText("Sign"));
		button.click();
		
		

	}

}
