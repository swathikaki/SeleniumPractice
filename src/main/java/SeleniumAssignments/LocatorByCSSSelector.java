package SeleniumAssignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LocatorByCSSSelector {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();  //Launch Chrome
		driver.get("https://app.hubspot.com/signup"); // Launch URL
		
		Thread.sleep(5000);
		
		//4. CSSSelector
		//Right click on tag name and select Copy Selector
		
//		WebElement email = 	driver.findElement(By.cssSelector("#username"));
//		WebElement password = driver.findElement(By.cssSelector("#password"));
//		WebElement loginBtn = driver.findElement(By.cssSelector("#loginBtn"));
//		
//		email.sendKeys("test123456@gmail.com");
//		password.sendKeys("test123456");
//		loginBtn.click();
		
		//Signup page
		
		WebElement firstName = 	driver.findElement(By.cssSelector("#uid-firstName-5"));
		WebElement lastName = driver.findElement(By.cssSelector("#uid-lastName-6"));
		WebElement email = driver.findElement(By.cssSelector("#uid-email-7"));
		//WebElement nextBtn = driver.findElement(By.className("hDFKtl"));
		WebElement nextBtn = driver.findElement(By.xpath("//span[@id='signup-app']/div/div/div[1]/div[2]/div/div/div[1]/div[3]/div[1]/button/div/div/div[2]/span"));
		
		firstName.sendKeys("Selenium");
		lastName.sendKeys("Test");
		email.sendKeys("SeleniumTest@gmail.com");
		Thread.sleep(2000);
		nextBtn.click();
		//nextBtn.submit();
		
		
		
		//Thread.sleep(5000);
		//driver.quit();
		
		

	}

}
