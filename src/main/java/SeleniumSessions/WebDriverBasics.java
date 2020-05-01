package SeleniumSessions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebDriverBasics {

	
	
	public static void main(String[] args) {
		// on windows
		// C:\Swathi\Selenium2020\chromedriver_win32\\chromedriver.exe   is the path of browser exe file
		
		System.setProperty("webdriver.chrome.driver",  "C:\\Swathi\\Selenium2020\\chromedriver.exe");  //Browser exe for Chrome version 80
				
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize(); //just maximize the window
		//driver.manage().window().fullscreen();  //To get the full screen based on screen size
		//driver.manage().deleteAllCookies();  //To delete all Cookies
		
		driver.get("http:\\www.google.com");  //Launch the URL  //method overriding // protocol http or https must be provided
		
		String title = driver.getTitle();  //Get the page title
		System.out.println("Page title is:" + title);
		
		if(title.contentEquals("Google"))
			System.out.println("Correct Title");
		else
			System.out.println("Incorrect Title");
		
		//get the current URL
		System.out.println("Current URL is: " + driver.getCurrentUrl());
		String url = driver.getCurrentUrl();
		if(url.contains("google"))
			System.out.println("Correct URL");
		else
			System.out.println("Incorrect URL");
		
		//System.out.println("Page Source is: " + driver.getPageSource());  //Get the current PageSource
		
		//driver.quit();
		driver.close();
		
	}

}
