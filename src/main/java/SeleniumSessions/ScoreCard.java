package SeleniumSessions;

	import java.util.ArrayList;
	import java.util.List;
	import java.util.concurrent.TimeUnit;

	import org.openqa.selenium.By;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.chrome.ChromeDriver;

	import io.github.bonigarcia.wdm.WebDriverManager;

	public class ScoreCard {

		public static void main(String[] args) {

			WebDriverManager.chromedriver().setup();

			WebDriver driver = new ChromeDriver();
			driver.get("https://www.espncricinfo.com/series/19832/scorecard/1220280/england-vs-sri-lanka-8th-match-carlton-&-united-series-retrolive-2019-20");
			driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
			
			getWicketTaker( driver, "NV Knight");
			getWicketTaker( driver, "N Hussain");

			System.out.println(getScoreCard(driver, "N Hussain"));
			System.out.println(getScoreCard(driver, "NH Fairbrother"));

			
			
		}
		
		
		public static String getWicketTaker(WebDriver driver, String playerName){
			System.out.println("wicket taker for player : " + playerName);
			String text  = driver.findElement(By.xpath("//a[text()='"+playerName+"']//parent::div//following-sibling::div/a")).getText();
			System.out.println(text);
			return text;
		}
		
		public static List<String> getScoreCard(WebDriver driver, String playerName){
			System.out.println("score card for player : "+ playerName);
			List<String> scoreCardList = new ArrayList<String>();
			List<WebElement> scoreList = driver.findElements(By.xpath("//a[text()='"+playerName+"']//parent::div//following-sibling::div[@class='cell runs']"));
			for(int i=0; i<scoreList.size(); i++){
				String text = scoreList.get(i).getText();
				scoreCardList.add(text);
			}
			return scoreCardList;
		}
		
		

	}


