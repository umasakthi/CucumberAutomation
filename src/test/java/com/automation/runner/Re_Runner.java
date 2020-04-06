  package com.automation.runner;

import java.io.IOException;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

import com.automation.baseclass.BaseClass;
import com.automation.helper.FileReaderManager ;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features = "@Report\\return.txt",
glue = "com\\automation\\stepdefinition", 
//plugin = {"pretty", "html:Report","com.cucumber.listener.ExtentCucumberFormatter:Report\\extentReport.html"}, 
monochrome = true, dryRun = false, strict = true)



public class Re_Runner {


	public static WebDriver driver;

	@BeforeClass
	public static void setup() throws IOException 
	{

		String broswerName = FileReaderManager.getInstance().getcrInstance().getBrowserName();
		driver=BaseClass.browserLaunch(broswerName);
		
		
	}

	@AfterClass
	public static void tearDown() 
	{
		driver.close();

	}

	
}
