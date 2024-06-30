package runner;

import base.BaseClass;
import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features="src/test/java/features/LoginWithStaticParameter.feature",
glue={"steps"},monochrome = true,publish=true,
tags="not @smoke"
)
//glue= only package name should be given
//monochrome= remove unwanted data
//publish= it will generate basic report of cucumber

public class Login extends BaseClass{

}
