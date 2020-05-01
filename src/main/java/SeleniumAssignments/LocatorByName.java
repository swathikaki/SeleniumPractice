package SeleniumAssignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LocatorByName {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();  //Launch Chrome
		driver.get("https://classic.crmpro.com"); // Launch URL
		
		Thread.sleep(5000);
		
		// 2. Name
		WebElement email = 	driver.findElement(By.name("username"));
		WebElement password = driver.findElement(By.name("password"));
		
		//Can't use name for Login button as there is no name for Login button
		//WebElement loginBtn = driver.findElement(By.id("u_0_b"));
		
		email.sendKeys("test123456@gmail.com");
		password.sendKeys("test123456");
		//loginBtn.click();
		

	}

}
