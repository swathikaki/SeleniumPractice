package SeleniumAssignments;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LocatorByCSSSelectorSignup {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();  //Launch Chrome
		driver.get("https://app.hubspot.com/signup"); // Launch URL
		
		Thread.sleep(5000);
		
//		Alert alert = driver.switchTo().alert();
//		String text = alert.getText();
//		System.out.println("Alert Text: "+ text);
//		alert.accept();
		
		//Set doesn't contain duplicate values
		Set<String> handles = driver.getWindowHandles(); //to get window IDs  //Window IDs are always unique so returning Set.
		List<String> handlesList = new ArrayList<String>(handles);
		System.out.println("Number of total Window handles: " + handlesList.size());
		String parentWindowID = handlesList.get(0);
		System.out.println("Parent Window ID: "+parentWindowID);
		
//		String childWindowID = handlesList.get(1);
//		System.out.println("1st Child (New Tab) Window ID: "+childWindowID);
//		driver.switchTo().window(childWindowID);  // To Switch To 1st Child Window
//		System.out.println("1st Child window New Tab title is: " +driver.getTitle());
		
		driver.findElement(By.id("hs-eu-confirmation-button")).click();   // To accept the Cookies
		
		//to close only the child window or popup is
		//driver.close();
		//driver.switchTo().window(parentWindowID);
		
		WebElement firstName = 	driver.findElement(By.cssSelector("#uid-firstName-5"));
		WebElement lastName = driver.findElement(By.cssSelector("#uid-lastName-6"));
		WebElement email = driver.findElement(By.cssSelector("#uid-email-7"));
			
		firstName.sendKeys("Selenium");
		lastName.sendKeys("Test");
		email.sendKeys("SeleniumTest@gmail.com");
		Thread.sleep(2000);
		WebElement nextBtn = driver.findElement(By.className("hDFKtl"));
		nextBtn.click();
		//nextBtn.submit();  //will not work, click should be done
	}

}
