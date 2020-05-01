package SeleniumSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LocatorConcept {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver = new ChromeDriver();  //Launch Chrome
//		driver.get("https://app.hubspot.com/login"); // Launch URL
		
		//1. id
		//driver.findElement(By.id("username")).sendKeys("test@gmail.com");
		//driver.findElement(By.id("password")).sendKeys("test123");
		//driver.findElement(By.id("loginBtn")).click();
		
		Thread.sleep(5000);
		//good approach is create web element  then perform action
		//create web element
		//WebElement email = driver.findElement(By.id("username"));
//		WebElement password = driver.findElement(By.id("password"));
//		WebElement loginButton = driver.findElement(By.id("loginBtn"));
//		
		//perform action
		//email.sendKeys("test@gmail.com");
//		password.sendKeys("test123");
//		loginButton.click();
//		
		
		//2. name
//		driver.get("https://http://classic.crmpro.com/");
//		driver.findElement(By.name("username")).sendKeys("test@gmail.com");
//		
//		WebElement email = driver.findElement(By.name("username"));
//		email.sendKeys("test@gmail.com");
		
		//3. Class name
		
		//form-control private-form__control login-password m-bottom-3
		//driver.findElement(By.className("login-email")).sendKeys("test123@gmail.com");
		//driver.findElement(By.className("login-password")).sendKeys("test123");
		
		//4. Xpath   is a locator, but not an attribute
//		driver.findElement(By.xpath("//input[@id='username']")).sendKeys("test@gmail.com");;
//		driver.findElement(By.xpath("//input[@id='password']")).sendKeys("test123");
//		driver.findElement(By.xpath("//input[@id='loginBtn']")).click();		
//		
		
		//5. CSS Selector,  is a locator
		
//		driver.findElement(By.cssSelector("#username")).sendKeys("test123@gmail.com");
//		driver.findElement(By.cssSelector("#password")).sendKeys("test123");
//		driver.findElement(By.cssSelector("#loginBtn")).click();
//		
		//6. Linktext   only for links
//		driver.findElement(By.linkText("Sign Up")).click();		
		
		//7. partialLinkText   only for links
		
//		driver.findElement(By.partialLinkText("Sign")).click();
		
		//Sign UP   //partial link text will go for first "Sign" element
		//Sign in
		
		//8. tagName,   special locator
		
		driver.get("https://freshworks.com");
		String text = driver.findElement(By.tagName("h1")).getText();
				System.out.println(text);
		
		
		
		
	}

}
