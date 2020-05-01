package TestNGSessions;

import org.testng.annotations.Test;

public class ExpectedExceptionConcept {
	
	
	@Test(expectedExceptions = ArithmeticException.class)  //will catch only Arithematic exception
	public void test1() {
		System.out.println("test1");
		int i=9/0;
		System.out.println("Is this SOP executed? after Exception");
	}
	
	@Test(expectedExceptions = Exception.class)   //will catch any type of Exception
	public void test2() {
		System.out.println("test2");
		int i=9/0;
	}
	

	@Test(expectedExceptions = NullPointerException.class)   //will not work as exception type is not matching
	public void test3() {
		System.out.println("test3");
		int i=9/0;  //will give arithematic exception
	}
	
	
}
