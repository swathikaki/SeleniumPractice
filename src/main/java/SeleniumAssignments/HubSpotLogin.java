package SeleniumAssignments;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class HubSpotLogin {

	public static void main(String[] args) throws InterruptedException {
				
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();  //Launch Chrome
		WebElelementUtil elementUtil = new WebElelementUtil(driver);
		
		By emailID = By.id("username");
		By password = By.id("password");
		By loginBtn = By.id("loginBtn");
		By hubspotLogo = By.id("hs-nav-v4--logo");
		By header = By.cssSelector("h1.private-page__title");
		
		//String url = "https://app.hubspot.com/login";
		driver.get("https://app.hubspot.com/login");
		
		Thread.sleep(5000);
		
		System.out.println("Login Page title is: "+ driver.getTitle());
		
		driver.findElement(emailID).sendKeys("swathi.kaki@gmail.com");
		driver.findElement(password).sendKeys("MyTest1234$");
		driver.findElement(loginBtn).click();
		Thread.sleep(5000);
		
		System.out.println("Home Page title is: "+ driver.getTitle());
		
		driver.findElement(hubspotLogo).click();
		
		System.out.println("Home Page title after clicking Hubspot logo is: "+ driver.getTitle());
		Thread.sleep(5000);
		
		System.out.println("Header is: "+driver.findElement(header).getText());
		
		
//		WebElement emailID = driver.findElement(By.id("username"));
//		WebElement password = driver.findElement(By.id("password"));
//		WebElement loginBtn = driver.findElement(By.id("loginBtn"));
//		
		//elementUtil.WaitForElementToBePresent(emailID,5);
		
//		String str = elementUtil.WaitForUrl(url, 5);
//		System.out.println("Title is: "+str);
		
	//	String title = elementUtil.WaitForTitleToBePresent("Hubspot Login", 5);
	//	System.out.println("Title is: "+title);
		
//		emailID.sendKeys("swathi@gmail.com");
//		password.sendKeys("123456");
//		loginBtn.click();

	}

}
