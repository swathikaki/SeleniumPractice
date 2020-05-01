package SeleniumSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DragAndDropConcept {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();  //Launch Chrome
		driver.get("http://jqueryui.com/resources/demos/droppable/default.html"); // Launch URL
		
		Thread.sleep(5000);
		
		WebElement source = driver.findElement(By.id("draggable"));
		WebElement target = driver.findElement(By.id("droppable"));
		
		Actions action = new Actions(driver);
		
		//works only b/w web elements not works for file drag and drop
		//action.dragAndDrop(source, target).build().perform();  //can use any method to drag and perform
		action.clickAndHold(source).moveToElement(target).release().build().perform();
		
		//we have only one action, so we can build and perform
		
		
	}

}
