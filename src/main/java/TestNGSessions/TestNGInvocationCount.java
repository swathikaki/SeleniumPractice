package TestNGSessions;

import org.testng.annotations.Test;

public class TestNGInvocationCount {
	
	
	@Test(invocationCount=3)    //Same TC will be executed 3 times
	public void invocationCountTest1() {
		System.out.println("invocationCountTest 1");		
	}
	
	@Test(invocationCount=5) //Same TC will be executed 5 times
	public void invocationCountTest2() {
		System.out.println("invocationCountTest 2");		
	}
	
	

}
