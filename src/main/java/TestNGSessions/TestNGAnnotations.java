package TestNGSessions;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestNGAnnotations {
	
	//Before Suite
	//Before Test
	//Before Class
	
	//Before Method
	//Test1
	//After Method
	
	//Before Method
	//Test2
	//After Method
	
	//After Class
	//After Test
	//After Suite
	
	
	//1	
	@BeforeSuite
	public void beforeSuite() {
		System.out.println("Before suite method: Prepare Test ");
	}
	
	//2
	@BeforeTest
	public void beforeTest() {
		System.out.println("Before test method: Create Database Connection");
	}
	
	//3
	@BeforeClass
	public void beforeClass() {
		System.out.println("Before Class method: Launch Browser and URL");
	}
	
	//4
	@BeforeMethod
	public void beforeMethod() {
		System.out.println("Before Method method: LogIn");
	}
	
	//5
	@Test
	public void test1() {
		System.out.println("Test1 method: Check User is logged in");		
	}
	
	@Test
	public void test2() {
		System.out.println("Test2 method: Check Account name is present");		
	}	
	
	
	@AfterMethod
	public void afterMethod() {
		System.out.println("After Method method: Logout");
	}
	
	@AfterClass
	public void afterClass() {
		System.out.println("After Class method: Close the Browser");
	}
	
	@AfterTest
	public void afterTest() {
		System.out.println("After Test method: Disconnect Database");
	}
	
	@AfterSuite
	public void afterSuite() {
		System.out.println("After Suite method: Delete the test data");
	}
	
	

}
