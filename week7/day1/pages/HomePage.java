package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import base.BaseClass;

public class HomePage extends BaseClass {

	public HomePage(ChromeDriver driver) {
	this.driver=driver;	
	}
	
	
	public MyHomePage clickonCRMSFA() {
		driver.findElement(By.linkText("CRM/SFA")).click();
		return new MyHomePage();

	}
	
	
	public LoginPage clickOnLogout() {
		driver.findElement(By.className("decorativeSubmit")).click();	
		return new LoginPage(driver);
	}
}
