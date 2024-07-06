package runner;

import org.testng.annotations.Test;

import base.BaseClass;
import pages.LoginPage;

public class LoginOut_TC002 extends BaseClass {

	
	@Test
	public void logout() {
		LoginPage lp = new LoginPage(driver);
		System.out.println(driver);
		lp.enterTheUsername("DemoSalesManager")
		.enterThePassword("crmsfa")
		.clickOnLoginButton()
		.clickOnLogout();
		
	}
}
