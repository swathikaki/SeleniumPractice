package SeleniumSessions;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AlertPopupWindow {

	public static void main(String[] args) throws InterruptedException {
		
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();  //Launch Chrome
		driver.get("https://mail.rediff.com/cgi-bin/login.cgi"); // Launch URL
		
		driver.findElement(By.name("proceed")).click();
		
		Thread.sleep(5000);
		Alert alert = driver.switchTo().alert();
		String text = alert.getText();
		if(text.equals("Please enter a valid user name")) {
			System.out.println("Correct Error Message");
		}
		else {
			System.out.println("In correct Message");
		}
		
		alert.accept();  //Click on OK
		//alert.dismiss();  //Click on Cancel
		
		
	}

}
