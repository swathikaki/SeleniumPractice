package SeleniumSessions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class HeadLessBrowser {

	public static void main(String[] args) {

		//headless: no browser
		//not visible
		//testing will be done in background
		//fast
		
		WebDriverManager.chromiumdriver().setup();
		
		ChromeOptions co = new ChromeOptions();
		co.addArguments("--headless");
		
		WebDriver driver = new ChromeDriver(co);
		driver.get("http://www.google.com");  //launch URL
		String title = driver.getTitle();  //get the page title
		System.out.println("Title is: " + title);
		
		if(title.contentEquals("Google")) {
			System.out.println("Correct Title");
		}
		else {
			System.out.println("In correct Title");
		}
		
		driver.quit();
		
	}

}
