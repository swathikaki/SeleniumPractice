package SeleniumSessions;

import java.time.Duration;
import java.util.NoSuchElementException;
import java.util.function.Function;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FluentWaitConcept {

	public static void main(String[] args) {
		
		//Explicitly wait
		//1. WebDriverWait
		
		//2. FluentWait:
		//Timeout,  PollingPeriod,  ignoringException
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();  //Launch Chrome
		
		driver.get("https://classic.crmpro.com/");
		
		final By username = By.id("username");
		By password = By.id("password");
		By loginBtn = By.xpath("//input[@value='Login']");
		
		waitForElementWithFluentWait(driver, username).sendKeys("batchautomation");
		driver.findElement(password).sendKeys("Test@12345");
		driver.findElement(loginBtn).click();
				

	}   //main method
	
	
	public static WebElement waitForElementWithFluentWait(WebDriver driver, final By locator) {
		
		Wait<WebDriver> wait = new FluentWait<WebDriver>(driver)
				.withTimeout(Duration.ofSeconds(15))
				.pollingEvery(Duration.ofSeconds(3))
				.ignoring(NoSuchElementException.class);

		WebElement element = wait.until(new Function<WebDriver, WebElement>(){
			@Override
			public WebElement apply(WebDriver driver) {
				return driver.findElement(locator);
			}
		});
		
		return element;
		
		 
	}
	
	
	

}
