package SeleniumSessions;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BrowserWindowList {

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();  //Launch Chrome
		driver.get("http://popuptest.com/goodpopups.html"); // Launch URL
		
		driver.findElement(By.linkText("Good PopUp #3")).click();
		
		Set<String> handles = driver.getWindowHandles(); //to get window IDs
		
		//Converting Set into List
		List<String> handlesList = new ArrayList<String>(handles);
		
		System.out.println("Number of total Window handles: " + handlesList.size());
		
		String parentWindowID = handlesList.get(0);
		
		System.out.println("Parent Window ID: "+parentWindowID);
		
		String childWindowID = handlesList.get(1);
		System.out.println("Child Window ID: "+childWindowID);
		
		driver.switchTo().window(childWindowID);
		System.out.println("Child window title is: " +driver.getTitle());
		
		//to close only the child window or popup is
		driver.close();
		
		//To switch the driver back to Parent window after closing popup
		driver.switchTo().window(parentWindowID);
		System.out.println("Parent window title is: " +driver.getTitle());
		
		
		
		
		
		
	}

}
