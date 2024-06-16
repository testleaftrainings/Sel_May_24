package week4.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class LearnDragAndDropBy {

	public static void main(String[] args) {
		ChromeDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.manage().window().maximize();
		driver.get("https://www.leafground.com/drag.xhtml");
		
		WebElement dd = driver.findElement(By.id("form:conpnl_content"));
		
		Actions act=new Actions(driver);
		
		act.dragAndDropBy(dd, 120, 0).perform();
		
		
	
	}
}
