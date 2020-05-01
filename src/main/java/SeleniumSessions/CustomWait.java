package SeleniumSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CustomWait {

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();  //Launch Chrome
		
		driver.get("https://app.hubspot.com/login");
		
		By emailid = By.id("username");
		By password = By.id("password");
		By loginBtn = By.id("loginBtn");
		
		//getElementWithWait(driver, emailid, 8).sendKeys("swathi@gmail.com");
		
		boolean flag = elementIsDisplayedWithWait(driver, emailid,5);
		System.out.println("Element displayed is: "+flag);
		
		if(flag == true) {
		driver.findElement(emailid).sendKeys("username");
		driver.findElement(password).sendKeys("test@123");
		driver.findElement(loginBtn).click();
		}
		else {
			System.out.println("Element is not loaded within specified time");
		}
		
		

	}

	//Custom wait
public static WebElement getElementWithWait(WebDriver driver, By locator, int timeout) {
	
	WebElement element = null;
	for(int i=0; i<timeout; i++){
		
		try {
			element = driver.findElement(locator);
		}
		catch(Exception e) {
			System.out.println("Waiting for Element to be present "+ i + " secs");
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e1) {
			}
			
		}
	}
	
	return element;
} //end of function

//Custom wait till the element is displayed
public static boolean elementIsDisplayedWithWait(WebDriver driver, By locator, int timeout) {
	
	WebElement element = null;
	boolean flag = false;
	for(int i=0; i<timeout; i++){
		
		try {
			element = driver.findElement(locator);
			flag = element.isDisplayed();
		}
		catch(Exception e) {
			System.out.println("Waiting for Element to be present "+ i + " secs");
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e1) {
			}
			
		}
	}
	return flag;
} //end of function




}



