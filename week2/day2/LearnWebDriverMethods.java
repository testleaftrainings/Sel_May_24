package week2.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class LearnWebDriverMethods {

	public static void main(String[] args) {
		
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://leaftaps.com/opentaps/control/main");
	
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		String title = driver.getTitle();
		System.out.println(title);
		
		
		String currentUrl = driver.getCurrentUrl();
		System.out.println(currentUrl);
		
		
//		String text = driver.findElement(By.id("viewLead_firstName_sp")).getText();
//		System.out.println(text);
//		
//		if(text.contains("Dil")) {
//			System.out.println("Lead is Created");
//		}else {
//			System.out.println("Lead is not Created");
//		}

	}

}
