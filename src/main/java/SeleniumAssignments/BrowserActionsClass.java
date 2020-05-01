package SeleniumAssignments;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BrowserActionsClass {
	
	WebDriver driver;
	
	public WebDriver launchBrowser(String browser) {
		
		switch (browser) {
		case "Chrome":
			WebDriverManager.chromedriver().setup();
			
			driver = new ChromeDriver();
			break;
		case "Firefox":
			WebDriverManager.firefoxdriver().setup();
			driver = new FirefoxDriver();
			break;
		case "Safari":
			WebDriverManager.chromedriver().setup();
			driver = new SafariDriver();
			break;
			
		default:
			System.out.println("Please pass the correct browser: " + browser);
			break;
		
		}
		
		driver.manage().window().fullscreen();  //To get the full screen based on screen size
		driver.manage().deleteAllCookies();  //To delete all Cookies
		
		return driver;
	}
		
	public void launchUrl(String url) {
		driver.get(url);
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
	}
	
	public String doGetTitle() {
		return driver.getTitle();
	}
	
	public void quitBrowser() {
		driver.quit();
		System.out.println("Quitting the broswer");
	}
	

}
