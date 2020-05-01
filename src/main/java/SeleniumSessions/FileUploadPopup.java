package SeleniumSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FileUploadPopup {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();  //Launch Chrome
		driver.get("https://cgi-lib.berkeley.edu/ex/fup.html"); // Launch URL
		
		//File upload
		//type="file" is mandatory , in selenium, we can't handle without type="file", if not we have to use some 3rd party tool
		driver.findElement(By.name("upfile")).sendKeys("XML File Path On Computer To Upload");  //Give the exact path of the XML (on computer) file to upload
		
		//Thread.sleep(5000);
		
	}

}
