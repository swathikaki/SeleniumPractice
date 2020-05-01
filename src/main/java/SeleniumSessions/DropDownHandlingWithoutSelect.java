package SeleniumSessions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DropDownHandlingWithoutSelect {

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();  //Launch Chrome
		driver.get("https://www.facebook.com/"); // Launch URL
		
			
		String dob = "1-Jan-2020";
		String dayOptionsXpath = "//select[@id='day']/option";
		String monthOptionsXpath = "//select[@id='month']/option";
		String yearOptionsXpath = "//select[@id='year']/option";
		
		String dayOptionsCSS = "select#day option";
		String monthOptionsCSS = "select#month option";
		String yearOptionsCSS = "select#year option";
		
		
		//Selecting values using Xpath
//		doSelectValuefromDropDown(driver, "xpath", dayOptionsXpath, dob.split("-")[0]);
//		doSelectValuefromDropDown(driver,"xpath",  monthOptionsXpath, dob.split("-")[1]);
//		doSelectValuefromDropDown(driver, "xpath", yearOptionsXpath, dob.split("-")[2]);
//		
		//Selecting values using css selector
		doSelectValuefromDropDown(driver, "css", dayOptionsCSS, dob.split("-")[0]);
		doSelectValuefromDropDown(driver,"css",  monthOptionsCSS, dob.split("-")[1]);
		doSelectValuefromDropDown(driver, "css", yearOptionsCSS, dob.split("-")[2]);
		
		}
	
	public static void doSelectValuefromDropDown(WebDriver driver, String locator, String locatorVal, String val) {
		
		List<WebElement> valList = null;
		
		if(locator.equals("xpath")) {
			valList = driver. findElements(By.xpath(locatorVal));
		}
		else if(locator.equals("css")) {
			valList = driver. findElements(By.cssSelector(locatorVal));
		}
		
		System.out.println("List size: "+valList.size());
		for(int i=0; i<valList.size(); i++) {
			if(valList.get(i).getText().contentEquals(val)) {
				valList.get(i).click();
				break;
			}
		}
		
	}

}
