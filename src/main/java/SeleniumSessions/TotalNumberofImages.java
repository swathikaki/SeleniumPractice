package SeleniumSessions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TotalNumberofImages {

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver = new ChromeDriver();  //Launch Chrome
		driver.get("http://www.amazon.in");; // Launch URL
		
		//get total number of images on page
		//Images always will have tag name "img"
		
		List<WebElement> imgList = driver.findElements(By.tagName("img"));
		
		System.out.println("Images count is: " + imgList.size());
		
		for(int i=0; i<imgList.size(); i++) {
			System.out.println(imgList.get(i).getAttribute("src"));
			//"src" will have images link
		}
		
		
		
	}

}
