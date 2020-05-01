package SeleniumAssignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LocatorByXpath {

	public static void main(String[] args) throws InterruptedException {
		
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();  //Launch Chrome
		driver.get("https://app.hubspot.com/login"); // Launch URL
		
		Thread.sleep(5000);
		
		//4. Xpath  is a locator but not an attribute, this is an address of the element in DOM
		// raw xpath :   //*[@id="username"]
		//replace * with tag name:  //input[@id="username"]
		//replace double coats with single quote:  //input[@id='username']
		
		WebElement email = 	driver.findElement(By.xpath("//input[@id='username']"));
		WebElement password = driver.findElement(By.xpath("//input[@id='password']"));
		WebElement loginBtn = driver.findElement(By.xpath("//button[@id='loginBtn']"));
		
		email.sendKeys("test123456@gmail.com");
		password.sendKeys("test123456");
		loginBtn.click();
		
		Thread.sleep(2000);
		driver.quit();

	}

}
