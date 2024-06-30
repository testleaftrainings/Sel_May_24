package base;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LearnWebTable {

	public static void main(String[] args) throws InterruptedException {

		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://www.leafground.com/table.xhtml");
		
		String rowcol = driver.findElement(By.xpath("//div[@class='ui-datatable-scrollable-body']/table/tbody/tr/td")).getText();
		System.out.println(rowcol);
		
		String partRowCol = driver.findElement(By.xpath("//div[@class='ui-datatable-scrollable-body']/table/tbody/tr[4]/td[3]")).getText();
		System.out.println(partRowCol+": value of4row and 3col");
		
		//get number rows count
		List<WebElement> rowcount = driver.findElements(By.xpath("//div[@class='ui-datatable-scrollable-body']/table/tbody/tr"));
		int rowSize = rowcount.size();
		System.out.println("row size :"+rowSize);
		
		//get number of col count
		List<WebElement> colcount = driver.findElements(By.xpath("//div[@class='ui-datatable-scrollable-body']/table/tbody/tr[1]/td"));
		int colSize = colcount.size();
		System.out.println("Col size :"+colSize);
		
		//print all the data from application -for loop
		
		for (int i = 1; i <=rowSize; i++) {
			
			for (int j = 1; j <=colSize; j++) {
				
				String totalRowColValue = driver.findElement(By.xpath("//div[@class='ui-datatable-scrollable-body']/table/tbody/tr["+i+"]/td["+j+"]")).getText();
				System.out.println(totalRowColValue);
				
			}
		}
		
		Thread.sleep(5000);
		driver.quit();
	}

}
