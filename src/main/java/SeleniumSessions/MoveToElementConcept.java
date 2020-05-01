package SeleniumSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class MoveToElementConcept {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();  //Launch Chrome
		driver.get("http://mrbool.com/how-to-create-menu-with-submenu-.html"); // Launch URL
		
		Thread.sleep(5000);
		
		WebElement contentLink = driver.findElement(By.className("menulink"));
		
		Actions action = new Actions(driver);
		action.moveToElement(contentLink).build().perform();
		
		driver.findElement(By.linkText("COURSES")).click();
		
	}

}
