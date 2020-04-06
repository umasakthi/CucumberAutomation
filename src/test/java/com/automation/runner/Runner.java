package com.automation.runner;

import java.io.IOException;

import org.junit.*;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

import com.automation.baseclass.BaseClass;
import com.automation.helper.FileReaderManager;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src\\test\\java\\com\\automation\\feature\\Automation.feature",
				glue = "com\\automation\\stepdefinition",
				plugin= {"pretty","html:Report","com.cucumber.listener.ExtentCucumberFormatter:Report\\extentReport.html","rerun:Report/return.txt"},
				monochrome = true, 
				dryRun = false, 
				strict = true)

public class Runner {
	public static WebDriver driver;


	@BeforeClass
	public static void setup() throws IOException {
		String browserName = FileReaderManager.getInstance().getcrInstance().getBrowserName();
		driver = BaseClass.browserLaunch(browserName);
	}

	@AfterClass
	public static void teardown() {
		driver.close();

	}

}
