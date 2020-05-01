package SeleniumSessions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DropDownHandling2 {

	public static void main(String[] args) {
		

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();  //Launch Chrome
		driver.get("https://www.facebook.com/"); // Launch URL
		
		WebElement day = driver.findElement(By.id("day"));
		WebElement month = driver.findElement(By.id("month"));
		WebElement year = driver.findElement(By.id("year"));
		
		String dob = "23-Nov-1975";
		
		//dividing the DOB string using split inbuilt method
		String str[] =  dob.split("-");
		System.out.println("Str size is:" +str.length);
		for(int i=0; i<str.length; i++)
		System.out.println("DOB string: "+str[i]);
		
		selectDropDownValue(day, dob.split("-")[0]);
		selectDropDownValue(month, dob.split("-")[1]);
		selectDropDownValue(year, dob.split("-")[2]);
		
		//selectDropDownValue(day, "23");
		//selectDropDownValue(month, "Nov");
		//selectDropDownValue(year, "1984");
	}
		
		
	public static void selectDropDownValue(WebElement element, String val) {
		Select select = new Select(element);
		List<WebElement> valList = select.getOptions();
		System.out.println(valList.size());
		
		//select drop down option without using in built method
		for(int i=0; i<valList.size(); i++) {
			if(valList.get(i).getText().contentEquals(val)) {
				valList.get(i).click();
				break;
			}
		}
	}
}
