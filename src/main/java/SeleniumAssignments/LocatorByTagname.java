package SeleniumAssignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LocatorByTagname {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();  //Launch Chrome
		driver.get("https://freshworks.com"); // Launch URL
		
		Thread.sleep(5000);
		
		//4. TagName  is a special locator, TagName is used when we have unique tag Name
		
		WebElement text = 	driver.findElement(By.tagName("h1"));
		
		//WebElement password = driver.findElement(By.tagName("//input[@id='password']"));
		//WebElement loginBtn = driver.findElement(By.tagName("//button[@id='loginBtn']"));
		
		String header = text.getText();
		System.out.println(header);
		
		
		Thread.sleep(2000);
		driver.quit();
		
		
		
	}

}
