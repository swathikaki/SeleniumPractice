package SeleniumSessions;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class RightClickConcept {

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();  //Launch Chrome
		driver.get("http://swisnl.github.io/jQuery-contextMenu/demo.html"); // Launch URL
		
		
		WebElement rightClickMe = driver.findElement(By.xpath("//span[text()='right click me']"));
		List<WebElement> optionsList =  driver.findElements(By.xpath("//ul/li[contains(@class,'context-menu-icon')]/span"));
		
		//doRightClick(driver, rightClickMe, optionsList, "Quit");  //using generic method
		
		List<String> rightClickOptionsList = getRightClickOption(driver, rightClickMe, optionsList);
		System.out.println("Total Right Click Options: "+ rightClickOptionsList.size());
		System.out.println(rightClickOptionsList);
	
	} //end of main
	
	//generic method to right click the selected option
	public static void doRightClick(WebDriver driver, WebElement rightClickElement, List<WebElement> optionsList, String val)
	{
		Actions action = new Actions(driver);
		action.contextClick(rightClickElement).build().perform();
		
		System.out.println("total options on right click: "+optionsList.size());
		for(int i=0; i<optionsList.size(); i++) {
			String text = optionsList.get(i).getText();
			System.out.println(i  + "-->" +text);
			
			if(text.contentEquals(val)) {
				optionsList.get(i).click();
				break;
			}
			
		}
	}
	
	//Generic method to return all right click options
	public static List<String> getRightClickOption(WebDriver driver, WebElement rightClickElement, List<WebElement> optionsList)
	{
		List<String> ar = new ArrayList<String>();
		Actions action = new Actions(driver);
		
		action.contextClick(rightClickElement).build().perform();
		
		System.out.println("Total right click option: " + optionsList.size());
		
		for(int i=0; i<optionsList.size(); i++) {
			String text = optionsList.get(i).getText();
			System.out.println(i  + "-->" +text);
			ar.add(text);
		}
		return ar;
	}

}
