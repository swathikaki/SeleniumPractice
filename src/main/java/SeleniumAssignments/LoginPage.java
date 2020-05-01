package SeleniumAssignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {
	
	//Page Objects
	//By Locators  on Login page of www.app.hubspot.com
	
	static By emailId = By.id("username");
	static By password = By.id("password");
	static By loginButton = By.id("loginBtn");
	static By signUpLink = By.linkText("sign up");
	//static By homePageHeader = By.className("private-page__title");
	static By homePageHeader = By.cssSelector("h1.private-page__title");
	
	public static void main(String args[]) throws InterruptedException {
		
		
		BrowserActionsClass br = new BrowserActionsClass();
		WebDriver driver = br.launchBrowser("Chrome");
		br.launchUrl("https://app.hubspot.com/login");
		Thread.sleep(5000);
		
		WebElelementUtil elementUtil = new WebElelementUtil(driver);
		
//		elementUtil.getWebElement(emailId).sendKeys("Automation1234@gmail.com");
//		elementUtil.getWebElement(password).sendKeys("Automation234");
//		elementUtil.getWebElement(loginButton).click();
		
		elementUtil.doSendKeys(emailId, "swathi.kaki@gmail.com");
		elementUtil.doSendKeys(password, "Swathi123$");
		elementUtil.doClick(loginButton);
		
		Thread.sleep(5000);
		
		String pageTitle = br.doGetTitle();
		System.out.println("Page Title after login: "+pageTitle);
		
		if(pageTitle.equals("HubSpot Login")) {
			System.out.println("Login has failed");
			}
		else {
			System.out.println("User has logged in successfully");
		}
		
//		String header = elementUtil.doGetText(homePageHeader);
//		System.out.println("Home Page Header is: "+header);
//		
//		if(header.contains("Sales Dashboard")) {
//			System.out.println("User has logged in successfully");
//			}
//		else {
//			System.out.println("Login has failed");
//		}
//		
//		System.out.println(br.doGetTitle());
		
		
	}
	
	

}
