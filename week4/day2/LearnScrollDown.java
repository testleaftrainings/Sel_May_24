package week4.day2;

import java.time.Duration;
import org.openqa.selenium.interactions.Actions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LearnScrollDown {

	public static void main(String[] args) {
		ChromeDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/");
		
		WebElement scrollDown = driver.findElement(By.xpath("(//span[@class='action-inner])[5]"));
		
		Actions act=new Actions(driver);
		
		act.scrollToElement(scrollDown).perform();
		
		
		
		
	
	}
}
