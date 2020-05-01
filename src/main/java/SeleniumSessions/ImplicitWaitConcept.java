package SeleniumSessions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ImplicitWaitConcept {

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();  //Launch Chrome
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);  //Implict wait, Global wait, dynamic wait
		
		driver.get("https://app.hubspot.com/login"); // Launch URL
		//Thread.sleep(5000);   //Static wait or Constant wait
		
		WebElement emailID = driver.findElement(By.id("username"));
		WebElement password = driver.findElement(By.id("password"));
		WebElement loginBtn = driver.findElement(By.id("loginBtn"));
		
		emailID.sendKeys("swathi@gmail.com");
		password.sendKeys("123456");
		loginBtn.click();
		
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS); //overrriding
		System.out.println(driver.getTitle());
		
		
		driver.manage().timeouts().implicitlyWait(5000, TimeUnit.MILLISECONDS); //Overloading
		
		driver.manage().timeouts().implicitlyWait(0, TimeUnit.SECONDS);  //Nullify the implicit wait
		
		
		
		

	}

}
