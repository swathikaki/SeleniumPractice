package TestNGSessions;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

//@Listeners(TestNGSessions.MyListenerTest.class)
public class HomeTest extends BaseTest {

	
	@Test
	public void header() {
		System.out.println("Home page Header Test");
	}
	
	
	
}
