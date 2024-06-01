package week2.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class LearnDropDown {

	public static void main(String[] args) {
ChromeDriver driver=new ChromeDriver();

driver.manage().window().maximize();

driver.get("https://www.leafground.com/select.xhtml");

//webElement-reuse variable more than one time
//ctrl+2-> l
//return type for findElement()-> WebElement
WebElement db = driver.findElement(By.className("ui-selectonemenu"));

//create object for select class
Select options=new Select(db);

//call the method 

//options.selectByVisibleText("Selenium");

options.selectByIndex(3);

//options.selectByValue("");


	}

}
