package TestNGSessions;

import org.testng.annotations.Test;

public class ContactTest extends BaseTest{
	
	//Automatically the tests from BaseTest will gets executed first
	
	@Test
	public void contact() {
		System.out.println("Contact Test");
	}
	
	
	

}
