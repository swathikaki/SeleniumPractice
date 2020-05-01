package SeleniumAssignments;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BrowserWindowsHandling {
	
public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();  //Launch Chrome
		driver.get("http://popuptest.com/goodpopups.html"); // Launch URL
		
		driver.findElement(By.linkText("Good PopUp #2")).click();  //will open in new Tab
		driver.findElement(By.linkText("Good PopUp #3")).click();
		driver.findElement(By.linkText("Good PopUp #4")).click();
		
		//Set doesn't contain duplicate values
		Set<String> handles = driver.getWindowHandles(); //to get window IDs  //Window IDs are always unique so returning Set.
		
		//Using Set and through Iterator
		Iterator<String> it = handles.iterator();
		String parentID = it.next();
		System.out.println("Iterator Parent Window ID: "+parentID);
		
		//Converting Set into List
		List<String> handlesList = new ArrayList<String>(handles);
		
		System.out.println("Number of total Window handles: " + handlesList.size());
		
		String parentWindowID = handlesList.get(0);
		System.out.println("Parent Window ID: "+parentWindowID);
		
		String childWindowID = handlesList.get(1);
		System.out.println("1st Child (New Tab) Window ID: "+childWindowID);
		
		driver.switchTo().window(childWindowID);  // To Switch To 1st Child Window
		System.out.println("1st Child window New Tab title is: " +driver.getTitle());
		//to close only the child window or popup is
		driver.close();
		
		//2nd child window is
		driver.switchTo().window(handlesList.get(2));  // To Switch To 1st Child Window
		System.out.println("2nd Child window title is: " +driver.getTitle());
		//to close only the child window or Popup is
		driver.close();  //we shouldn't use Quit as main window is still open
		
		//3rd child window is
		driver.switchTo().window(handlesList.get(3));  // To Switch To 1st Child Window
		System.out.println("3rd Child window title is: " +driver.getTitle());
		//to close only the child window or Popup is
		driver.close();  //we shouldn't use Quit as main window is still open
				
		//To switch the driver back to Parent window after closing popup
		driver.switchTo().window(parentWindowID);
		System.out.println("Parent window title is: " + driver.getTitle());
		driver.quit();
			
	}
	
	

}
