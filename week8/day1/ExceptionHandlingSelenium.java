package week8.day1;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.NoSuchElementException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.chrome.ChromeDriver;

public class ExceptionHandlingSelenium {

	public static void main(String[] args) throws IOException {
		ChromeDriver driver  = new ChromeDriver();
			driver.manage().window().maximize();
			driver.get("http://leaftaps.com/opentaps/control/main");
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
			try {
				driver.findElement(By.id("usernam")).sendKeys("Demosalesmanager");
		
			} catch (Exception e) {
				System.out.println(e);
				driver.findElement(By.name("USERNAME")).sendKeys("DemoCsr");
 //throw new NoSuchElementException("check the locator name and value");
			}
			try {
				driver.findElement(By.id("passwor")).sendKeys("crmsfa");
			} catch (Exception e) {
				System.out.println(e);
				driver.findElement(By.id("password")).sendKeys("crmsfa");
				throw new NoAlertPresentException("check alert is present");
			}
			
			
			try {
				driver.findElement(By.className("decorativeSubmit")).click();
			} catch (Exception e) {
				System.out.println(e);
			}
			
			File screenshotAs = driver.getScreenshotAs(OutputType.FILE);
			File dst=new File("./snap/img.png");
			FileUtils.copyFile(screenshotAs, dst);
	}

}
