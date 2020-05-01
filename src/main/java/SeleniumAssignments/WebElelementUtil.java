package SeleniumAssignments;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WebElelementUtil {

	WebDriver driver = null;
	
	public WebElelementUtil(WebDriver driver) {
		this.driver = driver;
	}
	
	public WebElement getWebElement(By locator) {
		WebElement element = driver.findElement(locator);
		return element;
	}
	
	public void doSendKeys(By locator, String val) {
		getWebElement(locator).sendKeys(val);
	}
	
	public void doClick(By locator) {
		getWebElement(locator).click();
	}
	
	public String doGetText(By locator) {
		return getWebElement(locator).getText();
	}
	
	//DROP Down utils 
	
	/***
	 * 
	 * @param locator
	 */
	//generic method to get all drop down values using Select class
		public void getDropDownValues(By locator) {
			Select select = new Select(getWebElement(locator));
			List<WebElement> optionsList = select.getOptions();
			System.out.println("total values in drop down is : "+optionsList.size());
			for(int i=0; i<optionsList.size(); i++)
				System.out.println(optionsList.get(i).getText());
		}
		
		/***
		 * 
		 * @param locator
		 * @param value
		 */
		//Select Drop down by Value
		public void selectDropDown(By locator, String value) { //method overloading
			Select select = new Select(getWebElement(locator));
			select.selectByVisibleText(value);
		}
		
		/***
		 * 
		 * @param locator
		 * @param index
		 */
		//Select drop down by Index
		public void selectDropDown(By locator, int index) { //method overloading
			Select select = new Select(getWebElement(locator));
			select.selectByIndex(index);
		}
		
		/***
		 * 
		 * @param locator
		 * @param val
		 */
		//generic method to select drop down value without inbuilt select method
		public void selectDropDownValue(By locator, String val) {
			Select select = new Select(getWebElement(locator));
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

		
		/***
		 * 
		 * @param locator
		 * @param locatorVal
		 * @param val
		 */
		//Drop down handle without select class
		public void doSelectValuefromDropDown(String locator, String locatorVal, String val) {
			
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

		
		/****
		 * 
		 * 
		 * @param locator
		 * @return
		 */
		//get Drop Down list using By locator
		public List<String> getDropDownValuesList(By locator) {
			List<String> ar = new ArrayList<String>();
			Select select = new Select(getWebElement(locator));
	
			List<WebElement> optionsList = select.getOptions();
			//System.out.println("total values in drop down are: "+optionsList.size());
			for(int i=0; i<optionsList.size(); i++) {
				ar.add(optionsList.get(i).getText());
			}
			return ar;
		}
		
	
	
	//Right Click (Context Click) utils
	
	//generic method to right click the selected option
	public void doRightClick(WebDriver driver, By locator, List<WebElement> optionsList, String val){
		Actions action = new Actions(driver);
		WebElement rightClickElement = getWebElement(locator);
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
		public List<String> getRightClickOption(WebDriver driver, By locator, List<WebElement> optionsList)
		{
			List<String> ar = new ArrayList<String>();
			Actions action = new Actions(driver);
			WebElement rightClickElement = getWebElement(locator);
			action.contextClick(rightClickElement).build().perform();
			
			System.out.println("Total right click option: " + optionsList.size());
			
			for(int i=0; i<optionsList.size(); i++) {
				String text = optionsList.get(i).getText();
				System.out.println(i  + "-->" +text);
				ar.add(text);
			}
			return ar;
		}

	
	
		//Wait utility: wait custom methods
	
	public List<WebElement> visibilityOfAllElements(By locator, int timeout) {
		
		//List<WebElement> ElementList = new ArrayList();
		WebDriverWait wait = new WebDriverWait(driver,timeout);   //will keep trying for every 500 msec
		wait.until(ExpectedConditions.visibilityOfAllElements(driver.findElements(locator)));   ///
		return driver.findElements(locator);
		
	}
	
	public WebElement WaitForElementToBePresent(By locator, int timeout) {
		
		WebDriverWait wait = new WebDriverWait(driver,timeout);   //will keep trying for every 500 msec
		wait.until(ExpectedConditions.presenceOfElementLocated(locator));   ///
		return getWebElement(locator);
	}
	
	public String WaitForElementToBePresent(String title, int timeout) {
		
		WebDriverWait wait = new WebDriverWait(driver,timeout);   //will keep trying for every 500 msec
		wait.until(ExpectedConditions.titleContains(title));   ///
		return driver.getTitle();
	}
	
	public WebElement WaitForElementToBeClickable(By locator, int timeout) {
		
		WebDriverWait wait = new WebDriverWait(driver,timeout);   //will keep trying for every 500 msec
		wait.until(ExpectedConditions.elementToBeClickable(locator));   ///
		return getWebElement(locator);
	}
	
	public WebElement WaitForElementToBeVisible(By locator, int timeout) {
		WebElement element = getWebElement(locator);
		WebDriverWait wait = new WebDriverWait(driver,timeout);   //will keep trying for every 500 msec
		wait.until(ExpectedConditions.visibilityOf(element));   ///
		return element;
	}
	
	public WebElement WaitForElementToBeVisibilityLocated(By locator, int timeout) {
		WebDriverWait wait = new WebDriverWait(driver,timeout);   //will keep trying for every 500 msec
		wait.until(ExpectedConditions.visibilityOfElementLocated(locator));   ///
		return getWebElement(locator);
	}
	
	public String WaitForUrl(String url, int timeout) {
		
		WebDriverWait wait = new WebDriverWait(driver,timeout);   //will keep trying for every 500 msec
		wait.until(ExpectedConditions.urlContains(url));   ///
		return driver.getTitle();
	}
	
	public String WaitForTitleToBePresent(String title, int timeout) {
		
		WebDriverWait wait = new WebDriverWait(driver,timeout);   //will keep trying for every 500 msec
		wait.until(ExpectedConditions.titleIs(title));   ///
		return driver.getTitle();
	}
	
	public boolean WaitForAlertToBePresent(int timeout) {
		
		WebDriverWait wait = new WebDriverWait(driver,timeout);   //will keep trying for every 500 msec
		wait.until(ExpectedConditions.alertIsPresent());   ///
		return true;
	}
	
	public void clickWhenReady(By locator, int timeout) {
		WebDriverWait wait = new WebDriverWait(driver,timeout);   //will keep trying for every 500 msec
		wait.until(ExpectedConditions.elementToBeClickable(locator));   ///
		 getWebElement(locator).click();
	}
	
	
}
