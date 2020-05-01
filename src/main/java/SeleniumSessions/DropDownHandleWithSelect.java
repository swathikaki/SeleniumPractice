package SeleniumSessions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DropDownHandleWithSelect {

	public static void main(String[] args) {
		
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();  //Launch Chrome
		driver.get("https://www.facebook.com/"); // Launch URL
		
		WebElement day = driver.findElement(By.id("day"));
		WebElement month = driver.findElement(By.id("month"));
		WebElement year = driver.findElement(By.id("year"));
		
		Select select = new Select(month);
		//select.selectByValue("20");
		//select.selectByIndex(9);   //only for constant values whose values never get changed
		//select.selectByVisibleText("15");  //Best option of coding
		
		System.out.println("Is Multiple selection allowed on DropDown: "+select.isMultiple()); //gives True if the dropdown list allows selecting multiple values at a time
		
//		List<WebElement> monthList = select.getOptions();
//		System.out.println("total values in day drop down is : "+monthList.size());
//		System.out.println("Months List is: ");
//		for(int i=0; i<monthList.size(); i++)
//			System.out.println(monthList.get(i).getText());
		
//		
//		Select select1 = new Select(month);
//		select1.selectByValue("Jun");  //if the value property is available, then only we can use
//		select1.selectByIndex(9);   //only for constant values whose values never get changed
//		select1.selectByVisibleText("Nov");  //Best option of coding
//		
//		Select select2 = new Select(year);
//		select2.selectByVisibleText("1984");  //Best option of coding
//		
		//By Visible Text
		selectDropDown(day, "5");
		selectDropDown(month, "Jun");
		selectDropDown(year, "2005");
		
		//By Index
//		selectDropDown(day, 1);
//		selectDropDow(month, 3);
//		selectDropDown(year, 5);
//		
		getDropDownValues(month);
		getDropDownValues(day);
		
	}
	
	//generic method to get all drop down values
	public static void getDropDownValues(WebElement element) {
		Select select = new Select(element);
		List<WebElement> optionsList = select.getOptions();
		System.out.println("total values in drop down is : "+optionsList.size());
		//System.out.println("Options List is: "+ optionsList);
		for(int i=0; i<optionsList.size(); i++)
			System.out.println(optionsList.get(i).getText());
	}
	
	public static void selectDropDown(WebElement element, String value) { //method overloading
		Select select = new Select(element);
		select.selectByVisibleText(value);
	}
	
	public static void selectDropDown(WebElement element, int index) { //method overloading
		Select select = new Select(element);
		select.selectByIndex(index);
	}

}
