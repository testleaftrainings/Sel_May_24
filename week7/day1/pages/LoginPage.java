package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import base.BaseClass;

public class LoginPage extends BaseClass{

	//create own constructor call for this class 
	//public LoginPage(RemoteWebDriver driver) -cross browser testing
	public LoginPage(ChromeDriver driver) {
		this.driver=driver;
	}
	
	public LoginPage enterTheUsername(String uName) {
		driver.findElement(By.id("username")).sendKeys(uName);
		//m1
		//LoginPage lp=new LoginPage();
		//return lp;
		
		//m2
		return this;
	
	}
	
	public LoginPage enterThePassword(String pass) {
		driver.findElement(By.id("password")).sendKeys(pass);
		return this;
	}
	
	public HomePage clickOnLoginButton() {
		driver.findElement(By.className("decorativeSubmit")).click();
		
		//m1
		//HomePage hp=new HomePage();
		//return hp;
		
		//m2
		return new HomePage(driver);

	}
	
}
