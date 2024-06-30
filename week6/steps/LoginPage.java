package steps;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import base.BaseClass;
import io.cucumber.java.en.But;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginPage  extends BaseClass{

//	@Given("Launch the Browser and Load the URL")
//	public void launch_the_browser_and_load_the_url() {
//		driver  = new ChromeDriver();
//		driver.manage().window().maximize();
//		driver.get("http://leaftaps.com/opentaps/control/main");
//		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));	    
//	}

	@When("Enter the Username as {string}")
	public void enter_the_username_as_demo_sales_manager(String uName) {
		driver.findElement(By.id("username")).sendKeys(uName);
  
	}

	@When("Enter the Password as {string}")
	public void enter_the_password_as_crmsfa(String pass) {
		driver.findElement(By.id("password")).sendKeys(pass);
	    
	}

	@When("Click on LoginButton")
	public void click_on_login_button() {
		driver.findElement(By.className("decorativeSubmit")).click();
	}
	
	@Then("Verify its in Homepage")
	public void verify_its_in_homepage() {
	  String title = driver.getTitle();
	  if(title.contains("TestLeaf")) {
		  System.out.println("Login is successfull");
	  }else {
		  System.out.println("Login is not Successfull");
	  }
	}
	
	
	@But("Verify its in Loginpage")
	public void verify_its_in_Loginpage() {
		  String title = driver.getTitle();
		  if(title.contains("Testleaf")) {
			  System.out.println("Login is successfull");
		  }else {
			  System.out.println("Login is not Successfull");
		  }
		}
	
}
