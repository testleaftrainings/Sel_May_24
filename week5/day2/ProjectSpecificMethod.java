package week5.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;

public class ProjectSpecificMethod {

	public RemoteWebDriver driver;
	
	//we can give in any order
	@Parameters({"url","password","username","browser"})
	
	@BeforeMethod
	//what order you given in the @Parameters same order need to given in the input agrs
	public void perSetUp(String url,String passwd,String uName,String browser) {
	  
		if(browser.equalsIgnoreCase("chrome")) {
			driver  = new ChromeDriver();
		} else if(browser.equalsIgnoreCase("edge")) {
			driver= new EdgeDriver();
		}
		
		driver.manage().window().maximize();
		driver.get(url);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.findElement(By.id("username")).sendKeys(uName);
		driver.findElement(By.id("password")).sendKeys(passwd);
		driver.findElement(By.className("decorativeSubmit")).click();
		driver.findElement(By.linkText("CRM/SFA")).click();
	}
	
	
	@AfterMethod
	public void postSetUp() {
	driver.quit();	
	}
	
	
}
