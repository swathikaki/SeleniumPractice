package SeleniumSessions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CustomXpathPart1 {

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();  //Launch Chrome
		driver.get("http://app.hubspot.com"); // Launch URL
		
		//Xpath is address of the element
		
		//Obsolute Xpath: /html/body/div/ul/li/a    // Risky, avoid using
		//Relative Xpath: //input[@id='test']   //good approach
		
		//xpath: address of the element in HTML DOM
				//1. abs xpath: /html/body/div/div[4]/div[6]/div/ul/li/a
				//2. relative/custom xpath: //input[@id='test']
				
				//htmltag[@prop='value']
				//input[@id='username']
				//*[@id='username']
				
				//htmltag[@prop1='value' and @prop2='value']
				//input[@id='username' and @type='email']
				//button[@id='loginBtn' and @type='submit']
				
				//button[@id='loginBtn' and @type]
				
				//button[@id and @type]
				//button[@id='ssoBtn' and @type]
				
				//input
				//input[@name='username']
				
				// (//input[@class='form-control'])[1]
				// (//input[@class='form-control'])[2]
				
				// (//input[@class='form-control'])[position()=1]
				// (//input[@class='form-control'])[position()=2]
				// (//input[@class='form-control'])[last()]
				
				//i18n-string[text()='Sign up']
				//a//i18n-string[text()='Sign up']
				
				//a[text()='Sign Up']
				
				//*[text()='Remember me']
				
				//a
				
				//ul[@class='nav navbar-nav navbar-right']/li/a --->6
				//ul[@class='nav navbar-nav navbar-right']/li/a[text()='Pricing']
				//li/a[text()='Pricing']
				//a[text()='Pricing']
				
				//div[@id='main_b_footer_second_block']/ul/li/a
				//div[@id='main_b_footer_second_block']//li/a
				
				//div/input --->2 --direct child elements
				//div//input --->3 --direct + indirect child elements --> 2+1 = 3
				
				//contains():
				//input[contains(@id,'username')]
				//input[@id='test_123']

				//input[contains(@id,'user')]
				
//				<input id='firstName_123'>
//				<input id='firstName_12223'>
//				<input id='firstName_12213'>
				
				//input[contains(@id,'firstName_')]
				//input[contains(@id,'user') and @type='email']
				//input[contains(@id,'user') and contains(@type,'email')]

				//i18n-string[contains(@data-key,'login.signupLink.cta') and text()='Sign up']
				
				//custom CSSSelector:
				
				//CSS -- Cascaded Style Sheet
				//id --> #id or htmltag#id --> single
				//class --> .className or htmltag.classname ---> single or multiple  
				//c1 c2 c3 ... cn
				//htmltag.c1.c2.c3....cn
				//.c1.c2.c3....cn
				
				// #username
				// input#username
				
				// .login-email
				// input.login-email
				// .form-control.private-form__control.login-email
				// input.form-control.private-form__control.login-email
				
				// input.login-email#username
				// input.form-control.private-form__control.login-email#username
				// input#username.login-email
				
				// input[id='username']
				// input[id='username'][type='email']
				
				// div.private-form__input-wrapper > input#username
				// div.private-form__input-wrapper  input#username
				// ul.list-nav-links li a
				
				
				//By email = By.className("login-email");
				//By email1 = By.xpath("//input[@class='form-control private-form__control login-email']");
				//By email2 = By.cssSelector("input.form-control.private-form__control.login-email");

				
		
		
		
	}

}
