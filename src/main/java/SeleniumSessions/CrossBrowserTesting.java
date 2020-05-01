package SeleniumSessions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.safari.SafariDriver;

public class CrossBrowserTesting {

	public static void main(String[] args) {
		
		String browser = "Firefox";
		WebDriver driver = null;
		
		if(browser.equalsIgnoreCase("Chrome")) {
			System.out.println("Chrome Browser");
			System.setProperty("webdriver.chrome.driver",  "C:\\Swathi\\Selenium2020\\chromedriver.exe");
			driver = new ChromeDriver();
			
		}
		else if(browser.equalsIgnoreCase("FireFox")) {
			System.out.println("Firefox Browser");
			
			System.setProperty("webdriver.gecko.driver",  "C:\\Swathi\\Selenium2020\\geckodriver.exe");
			System.out.println("System property set for Firefox driver");
			driver = new FirefoxDriver();
		}
		else if(browser.equalsIgnoreCase("Safari")) {
			System.out.println("Safari Browser");
			//System.setProperty("webdriver.chrome.driver",  "C:\\Swathi\\Selenium2020\\chromedriver_win32\\chromedriver.exe");
			driver = new SafariDriver();
		}
		else {
			System.out.println("Browser Not Found");
		}
		
		System.out.println("Launching URL");
		driver.get("http:\\www.google.com");
		String title = driver.getTitle();  //Get the page title
		System.out.println("Page title is: " + title);
		
		if(title.contentEquals(browser))
			System.out.println("Correct Title");
		else
			System.out.println("Incorrect Title");
		
		//get the current URL
		System.out.println("Current URL is: " + driver.getCurrentUrl());
		
		//driver.quit();
		//driver.close();
	}

}
