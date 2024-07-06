package runner;

import org.testng.annotations.Test;

import base.BaseClass;
import pages.LoginPage;

public class Login_TC001 extends BaseClass {
	
	
	@Test
	public void login() {
		
		LoginPage lp=new LoginPage(driver);
		System.out.println(driver);
		lp.enterTheUsername("DemoCsr")
		.enterThePassword("crmsfa")
		.clickOnLoginButton()
		.clickonCRMSFA();
	
	}

}
