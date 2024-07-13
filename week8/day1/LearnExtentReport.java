package week8.day1;

import java.io.IOException;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.MediaEntityBuilder;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

public class LearnExtentReport {

	public static void main(String[] args) throws IOException {
		
		//step1 set the path of report
		
		ExtentHtmlReporter wb=new ExtentHtmlReporter("./reports/loginreport.html");
		
		//old report should not override
		wb.setAppendExisting(true);
		
		//step2 create object for ExtentReports
		ExtentReports repo=new ExtentReports();
		
		//step3 combine step1 and step2 -> attachReporter
		repo.attachReporter(wb);
		//step4 create testcase dtls
		ExtentTest test=repo.createTest("LoginPage", "Login with vaild data for Leaftaps application");
		test.assignAuthor("Dilip");
		test.assignCategory("Sanity");
		
		//step 5 step level status
		test.pass("EnterUserName");
		test.pass("EnterPassWard");
		test.fail("LoginButton");
		
		//step4 create testcase dtls
				ExtentTest test1=repo.createTest("CrateLeadPage", "create leadwith vaild data for Leaftaps application");
				test1.assignAuthor("Ragu");
				test1.assignCategory("Smoke");
				
				//step 5 step level status
				test1.pass("EnterUserName");
				test1.pass("EnterPassWard");
				test1.pass("LoginButton");
				test1.pass("click on Crmsfa", MediaEntityBuilder.createScreenCaptureFromPath(".././snap/img.jpg").build());
	
		//step6- close extentreports object name
		
		repo.flush();
		System.out.println("done");
		
	}
}
