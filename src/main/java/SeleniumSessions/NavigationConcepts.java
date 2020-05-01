package SeleniumSessions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class NavigationConcepts {

	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();
		
		WebDriver driver = new ChromeDriver();  //Launch Chrome
		driver.get("http://www.google.com");; // Launch URL
		
		driver.navigate().to("https://www.facebook.com");  //launching url
		
		driver.navigate().back();
		
		driver.navigate().forward();
		
		driver.navigate().refresh();
		
		String title = driver.getTitle();  //get the page title
		System.out.println("Title is: " + title);
		
		
		
		
		

	}

}
