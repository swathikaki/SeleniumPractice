package SeleniumSessions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WebDriverManagerConcept {

	public static void main(String[] args) {
		
		
		WebDriverManager.chromedriver().setup();
				
		//WebDriverManager.getInstance(null)
		//WebDriverManager.firefoxdriver().setup();
		WebDriver driver = new ChromeDriver();
		
		System.out.println("Launching URL");
		driver.get("http:\\www.google.com");
		String title = driver.getTitle();  //Get the page title
		System.out.println("Page title is: " + title);
		
		if(title.equals("Google"))
			System.out.println("Correct Title");
		else
			System.out.println("Incorrect Title");
		
		//get the current URL
		System.out.println("Current URL is: " + driver.getCurrentUrl());
		
		driver.quit();
		
		
		
		

	}

}
