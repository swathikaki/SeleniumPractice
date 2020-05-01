package SeleniumAssignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LocatorByClassName {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();  //Launch Chrome
		driver.get("https://app.hubspot.com/login"); // Launch URL
		
		Thread.sleep(5000);
		
		// 3. className
		
		// form-control private-form__control login-email
		//form-control private-form__control login-password m-bottom-3
		//uiButton private-button private-button--primary private-button--default m-bottom-4 login-submit disabled private-button--disabled private-button--non-link
		
		WebElement email = 	driver.findElement(By.className("login-email"));
		WebElement password = driver.findElement(By.className("login-password"));
		
		//can use any unique class name for password as there are 2 unique class names for password
		//WebElement password = driver.findElement(By.className("m-bottom-3"));
		
		WebElement loginBtn = driver.findElement(By.className("login-submit"));
		
		email.sendKeys("test123456@gmail.com");
		password.sendKeys("test123456");
		loginBtn.click();
		
		
		//driver.quit();
	}

}
