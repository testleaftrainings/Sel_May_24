package week3.day2;

import java.time.Duration;
import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FindTotalLinks {

	public static void main(String[] args) {

		//findelements- get more than one value
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://www.leafground.com/link.xhtml");
		
		//return type findelements is List<WebElement>
		List<WebElement> links = driver.findElements(By.tagName("a"));
		int totalLinks = links.size();
		System.out.println(totalLinks);
		
		for (int i = 0; i < links.size(); i++) {
			
			String text = links.get(i).getText();
			System.out.println(text);
		}
	}

}
