package week4.day2;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TakeSnap {

	public static void main(String[] args) throws IOException {

		ChromeDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/");
		
		WebElement ele = driver.findElement(By.linkText("Sell"));
		
		//step1
		File scr = ele.getScreenshotAs(OutputType.FILE);
		
		//step2 create path for snapshot added
		File trg=new File("./snaps/img1.png");
		
		//step 3
		FileUtils.copyFile(scr, trg);
	}

}
