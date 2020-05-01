package SeleniumSessions;



import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class JqueryDropDownHandle {

	public static void main(String[] args) throws InterruptedException {
		
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();  //Launch Chrome
		driver.get("https://www.jqueryscript.net/demo/Drop-Down-Combo-Tree/"); // Launch URL
		
		Thread.sleep(5000);
		
		driver.findElement(By.id("justAnInputBox")).click();
		
		//Single Choice selection
		SelectChoiceValues(driver, "choice 2");
		
		//Multi choice selection
		//SelectChoiceValues(driver, "choice 2", "choice 3", "choice 6 2 3", "choice 7");
		
		//Select All the values
		//SelectChoiceValues(driver, "ALL");
	}	
		
	public static void SelectChoiceValues(WebDriver driver, String... val) {
	
		List<WebElement> choiceList = driver.findElements(By.cssSelector("span.comboTreeItemTitle"));
		
		if(! val[0].equalsIgnoreCase("ALL")) {  //If 1 or multiple val needs to be selected
			
			for(int i=0; i<choiceList.size(); i++) {
				String text = choiceList.get(i).getText();
				System.out.println(text);
				
				for(int k=0; k<val.length; k++) {
				if(text.equals(val[k])) {
					choiceList.get(i).click();
					break;
				}
				}
			}
		}
		
		else {   //If all values from drop down list need to be selected
			try {
			for(int i=0; i<choiceList.size(); i++) {
				choiceList.get(i).click();
		}
			}catch(Exception e) {
				
			}
		}
		
		
	}

}
