package SeleniumSessions;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import SeleniumAssignments.WebElelementUtil;
import io.github.bonigarcia.wdm.WebDriverManager;

public class DropDownHandlewithByLocator {

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();  //Launch Chrome
		driver.get("https://www.facebook.com/"); // Launch URL
		
		By day = By.id("day");
		By month = By.id("month");
		By year = By.id("year");
		
		List<String> daysList = getDropDownValuesList(driver, day);
		System.out.println("total values in Days drop down are: "+daysList.size());
		System.out.println(daysList);
		
		List<String> monthsList = getDropDownValuesList(driver, month);
		System.out.println("total values in Days drop down are: "+monthsList.size());
		System.out.println(monthsList);
		
		List<String> yearsList = getDropDownValuesList(driver, year);
		System.out.println("total values in Days drop down are: "+yearsList.size());
		System.out.println(yearsList);
	}
	
	public static List<String> getDropDownValuesList(WebDriver driver, By locator) {
		List<String> ar = new ArrayList<String>();
		WebElelementUtil elementUtil = new WebElelementUtil(driver);   //using Element Util class methods to getElement
		Select select = new Select(elementUtil.getWebElement(locator));
		
		List<WebElement> optionsList = select.getOptions();
		//System.out.println("total values in drop down are: "+optionsList.size());
		for(int i=0; i<optionsList.size(); i++) {
			//System.out.println(optionsList.get(i).getText());
			ar.add(optionsList.get(i).getText());
		}
		
		return ar;
	}

}
