package SeleniumSessions;

public class GoogleTest {

	public static void main(String[] args) {
		
		BrowserActions obj = new BrowserActions();
		obj.launchBrowser("Chrome");
		obj.launchUrl("http://google.com");
		
		String title = obj.doGetTitle();
		System.out.println("Title is: " + title);
		
		obj.quitBrowser();
	}

}
