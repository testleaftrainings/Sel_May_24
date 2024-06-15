package week4.day1;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class LearnAlert {

	public static void main(String[] args) {

		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://www.leafground.com/alert.xhtml");
		
		driver.findElement(By.xpath("//span[text()='Show']")).click();
		
		//switch driver control to alert box
		Alert alert = driver.switchTo().alert();
		
		//i need use alert methods
		String alertText = alert.getText();
		System.out.println(alertText);
		
	//	driver.findElement(By.xpath("//span[text()='Show']")).click();
		
		//accept the alert
		alert.accept();
		
	//	driver.findElement(By.xpath("(//span[text()='Show'])[2]")).click();
		
		//2 exceptions 
		//1.NoAlertPresentException
		//2.UnhandledAlertException
		//alert.accept();
		
		//sweet alert
		
		driver.findElement(By.xpath("(//span[text()='Show'])[3]")).click();
		
		driver.findElement(By.xpath("//span[@class='ui-icon ui-icon-closethick']")).click();
		
		
	}

}
