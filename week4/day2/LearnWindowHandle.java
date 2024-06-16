package week4.day2;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class LearnWindowHandle {

	public static void main(String[] args) throws InterruptedException {
		
		ChromeOptions options=new ChromeOptions();
		options.addArguments("--disable-notifications");
		ChromeDriver driver=new ChromeDriver(options);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://login.salesforce.com/");
		driver.findElement(By.id("username")).sendKeys("dilip@testleaf.com");
		driver.findElement(By.id("password")).sendKeys("testleaf@2024");
		driver.findElement(By.id("Login")).click();
		
		driver.findElement(By.xpath("//span[text()='Learn More']")).click();
		
		//getwindowhandle
		String parent = driver.getWindowHandle();
		System.out.println("parent window address "+parent );
		String parentTitle = driver.getTitle();
		System.out.println("parent tiltle "+parentTitle);
		
		//getwindowhandles
		
		Set<String> windowHandles = driver.getWindowHandles();
		System.out.println(windowHandles);
		//convert set into list
		
		List<String> windows=new ArrayList<String>(windowHandles);
		
		driver.switchTo().window(windows.get(1));
		String childTitle = driver.getTitle();
		System.out.println("child window title"+childTitle);
		Thread.sleep(3000);
		//button[text()='Confirm']
		driver.findElement(By.xpath("//button[text()='Confirm']")).click();
		
		//it will close current window or tab
		driver.close();//child window
		
		
		//switch back to parent window
		driver.switchTo().window(windows.get(0));
		driver.findElement(By.xpath("//span[text()='Learn More']")).click();
		
		//it close all the opened window or tab in the browser
		driver.quit();
	}

}
