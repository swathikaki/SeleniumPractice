package SeleniumSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FrameHandle {

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();  //Launch Chrome
		driver.get("http://londonfreelance.org/courses/frames/index.html"); // Launch URL
		
		//driver.switchTo().frame("main");  //passing frame name or id is good approach
		driver.switchTo().frame(2);   //passing index  //method overloading
		//driver.switchTo().frame(driver.findElement(By.className("main")));  //frame is a web element
		
		//Frame will have its Own DOM (Document Object Model)
		
		//WebElement header = driver.findElement(By.xpath("/html/body/h2"));   //Xpath
		WebElement header = driver.findElement(By.tagName("h2"));   //Tag name
		System.out.println("Header is: " + header.getText());
		
		driver.switchTo().defaultContent();  // To switch back to the main page from frame
		
		
	}

}
