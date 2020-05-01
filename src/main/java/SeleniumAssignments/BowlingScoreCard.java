package SeleniumAssignments;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BowlingScoreCard {

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();

		WebDriver driver = new ChromeDriver();
		driver.get("https://www.espncricinfo.com/series/19832/scorecard/1220280/england-vs-sri-lanka-8th-match-carlton-&-united-series-retrolive-2019-20");
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		
		System.out.println(getBowlerScoreCard(driver, "GP Wickramasinghe"));  //SriLanka Bowler
		System.out.println(getBowlerScoreCard(driver, "ST Jayasuriya")); //SriLanka Bowler
		System.out.println(getBowlerScoreCard(driver, "VJ Wells"));  //England Bowler
		System.out.println(getBowlerScoreCard(driver, "NV Knight"));  //Batsmen
		
	}
	
	public static List<String> getBowlerScoreCard(WebDriver driver, String playerName){
		System.out.println("score card for player : "+ playerName);
		List<String> scoreCardList = new ArrayList<String>();
		List<WebElement> scoreList = driver.findElements(By.xpath("//a[text()='"+playerName+"']//parent::td//following-sibling::td[@data-reactid]"));
		if((scoreList.size())==0) {  //Condition to check whether the PlayerName is present in Bowling table list
			System.out.print("Is not found in Bowlers list");
		}	
		for(int i=0; i<scoreList.size(); i++){
			String text = scoreList.get(i).getText();
			if(!(text.isEmpty()))  //add the text to the list if not empty
			scoreCardList.add(text);
			
		}
		return scoreCardList;
	}

}
