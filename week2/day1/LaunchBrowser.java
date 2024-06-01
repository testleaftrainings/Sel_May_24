package week2.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class LaunchBrowser {

	public static void main(String[] args) throws InterruptedException {

		//launch the chrome browser
		ChromeDriver driver=new ChromeDriver();
		
		//maximize window
		driver.manage().window().maximize();
		
		//pass url
		driver.get("http://leaftaps.com/opentaps/control/main");
		
		//enter the username
		
		driver.findElement(By.id("username")).sendKeys("DemoSalesManager");
		
		//enter the password
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		
		//click on login button
		driver.findElement(By.className("decorativeSubmit")).click();
		
		//click on crmsfa
		//driver.findElement(By.linkText("CRM/SFA")).click();
		
		driver.findElement(By.partialLinkText("CRM")).click();
		
		//get title of current page
		String title = driver.getTitle();
		System.out.println(title);
		
		//verify 
		if(title.contains("Home")) {
			System.out.println("page is verfied");
		}else {
			System.out.println("Page is not verfied");
		}
		
		//java wait
		//3000-3sec
		Thread.sleep(3000);
		
		//close browser
		driver.close();
		
	}

}
