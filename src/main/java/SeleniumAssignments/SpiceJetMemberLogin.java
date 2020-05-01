package SeleniumAssignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SpiceJetMemberLogin {

	public static void main(String[] args) throws InterruptedException {
				
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();  //Launch Chrome
		driver.get("http://spicejet.com"); // Launch URL
		
		Thread.sleep(5000);
		System.out.println("Home Page Title is: "+ driver.getTitle());
		
		WebElement login = driver.findElement(By.id("ctl00_HyperLinkLogin"));  //Login/Sign Up selection
		Actions action = new Actions(driver);
		action.moveToElement(login).build().perform();
		//Thread.sleep(1000);
		WebDriverWait wait = new WebDriverWait(driver,5);   //Explicit wait
		wait.until(ExpectedConditions.presenceOfElementLocated(By.linkText("SpiceClub Members")));
		
		WebElement spiceClubMember = driver.findElement(By.linkText("SpiceClub Members"));  //SpiceClub Member Selection
		//action.moveToElement(spiceClubMember).build().perform();
		spiceClubMember.click();
		//Thread.sleep(1000);
				
		//Sign up selection
		
		//using Xpath
		//WebDriverWait wait = new WebDriverWait(driver,5);  
		//wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//a[text()='Sign up']"))); //Explicit Wait
		//WebElement signUp = driver.findElement(By.xpath("//a[text()='Sign up']"));   // XPATH: "//a[text()='Sign up']"
		
		//using LinkText
//		WebDriverWait wait = new WebDriverWait(driver,5);   
//		wait.until(ExpectedConditions.presenceOfElementLocated(By.linkText("Sign up")));
//		WebElement signUp = driver.findElement(By.linkText("Sign up"));
//		
		//action.moveToElement(signUp).build().perform();
		//signUp.click();
		
		System.out.println("Page Title is: "+ driver.getTitle());
		
		//Member Login selection using linkText
		//WebDriverWait wait = new WebDriverWait(driver,5);   
		wait.until(ExpectedConditions.presenceOfElementLocated(By.linkText("Member Login")));
		WebElement memberLogin = driver.findElement(By.linkText("Member Login"));
		//action.moveToElement(memberLogin).build().perform();
		memberLogin.click();

	}

}
