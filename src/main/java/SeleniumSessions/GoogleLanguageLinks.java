package SeleniumSessions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class GoogleLanguageLinks {

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver = new ChromeDriver();  //Launch Chrome
		driver.get("https://www.google.co.in"); // Launch URL
		
		//get total number of language links on page
		
		List<WebElement> linkList = driver.findElements(By.xpath("//div[@id='SIvCob']/a"));
		
		System.out.println("Languages count is: " + linkList.size());
		
		for(int i=0; i<linkList.size(); i++) {
			String text = linkList.get(i).getText();
			System.out.println(text);
			linkList.get(i).click();
			//to avoid StateElement Exception, we have to get the new list of web elements after every click
			linkList = driver.findElements(By.xpath("//div[@id='SIvCob']/a"));  //creating new list every time as the links order getting changed every time
		}
		
	}

}
