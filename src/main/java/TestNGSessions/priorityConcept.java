package TestNGSessions;

import org.testng.annotations.Test;

public class priorityConcept {
	
	//lowest number will gets executed first -4, -3, -2, -1, 0, 1, 2, 3, 4
	
	@Test(priority=1)
	public void atest() {
		System.out.println("A test");
	}
	
	@Test(priority=0)
	public void btest() {
		System.out.println("B test");
	}
	
	@Test(priority=-3)
	public void ctest() {
		System.out.println("C test");
	}
	
	@Test(priority=-1)
	public void dtest() {
		System.out.println("D test");
	}
	
	

}
