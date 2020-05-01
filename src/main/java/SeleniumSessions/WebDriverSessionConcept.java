package SeleniumSessions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WebDriverSessionConcept {

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver = new ChromeDriver();  //Launch Chrome
		driver.get("http://www.google.com");; // Launch URL
		
		String title = driver.getTitle();  //get the page title
		System.out.println("Title is: " + title);
		
		//driver.quit();
		driver.close();
		
		System.out.println(driver.getTitle());  
		//if we use driver.quit(), will get NoSuchSessionException: Session ID is null 
		// if we use driver.close(), will get NoSuchSessionException: Invalid Session ID
	}

}
