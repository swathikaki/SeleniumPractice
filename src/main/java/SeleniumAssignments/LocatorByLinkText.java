package SeleniumAssignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LocatorByLinkText {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();  //Launch Chrome
		driver.get("https://app.hubspot.com/login"); // Launch URL
		
		Thread.sleep(5000);
		
		//4. LinkText, works only for links
		//Link is always represented by "a" tag
		
		WebElement button = driver.findElement(By.linkText("Sign up"));
		button.click();
		
		//Thread.sleep(2000);
		//driver.quit();
		
		
		
	}

}
