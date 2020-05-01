package TestNGSessions;

import org.testng.annotations.Test;

public class DependsOnMethodsConcept {
	
	@Test
	public void login() {
		System.out.println("Login");
		//failing deliberately
		//int i=9/0;
	}
	
	@Test(dependsOnMethods="login", priority=2)    //If Login TC is failed, this TC wont be executed
	public void home() {
		System.out.println("home");
	}
	
	@Test(dependsOnMethods="login", priority=1)  //If Login TC is failed, this TC wont be executed
	public void search() {
		System.out.println("Search");
	}
	
	

}
