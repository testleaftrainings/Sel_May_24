package week4.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class LearnContextClick {

	public static void main(String[] args) {
		ChromeDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.manage().window().maximize();
		driver.get("https://swisnl.github.io/jQuery-contextMenu/demo.html");
		
		WebElement rightClick = driver.findElement(By.xpath("//span[text()='right click me']"));
		
		//create object for Actions class
		Actions act=new Actions(driver);
		act.contextClick(rightClick).perform();
	
	}
}
