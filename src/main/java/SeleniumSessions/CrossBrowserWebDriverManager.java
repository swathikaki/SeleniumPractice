package SeleniumSessions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.safari.SafariDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CrossBrowserWebDriverManager {

	public static void main(String[] args) {
		
		String browser = "IE";
		WebDriver driver = null;
		
		if(browser.equalsIgnoreCase("Chrome")) {
			System.out.println("Chrome Browser");
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
		}
		else if(browser.equalsIgnoreCase("FireFox")) {
			System.out.println("Firefox Browser");
			WebDriverManager.firefoxdriver().setup();
			driver = new FirefoxDriver();
		}
		else if(browser.equalsIgnoreCase("Safari")) {
			System.out.println("Safari Browser");
			WebDriverManager.getInstance(SafariDriver.class).setup();
			driver = new SafariDriver();
		}
		else if(browser.equalsIgnoreCase("IE")) {
			System.out.println("IE Browser");
			WebDriverManager.getInstance(InternetExplorerDriver.class).setup();
			driver = new InternetExplorerDriver();
		}
		else {
			System.out.println("Browser Not Found");
		}
		
		System.out.println("Launching URL");
		driver.get("http:\\www.facebook.com");
		String title = driver.getTitle();  //Get the page title
		System.out.println("Page title is: " + title);
		
		if(title.contentEquals("Facebook"))
			System.out.println("Correct Title");
		else
			System.out.println("Incorrect Title");
		
		//get the current URL
		System.out.println("Current URL is: " + driver.getCurrentUrl());
		
		//driver.quit();
		//driver.close();

	}

}
