package com.automation.pom;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ConfirmOrder {
	public static WebDriver driver;

	public ConfirmOrder(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
// Address page
	
	@FindBy(name = "processAddress")
	private WebElement addpro;

//shipping
	
	@FindBy(id = "cgv")
	private WebElement agreeBt;
	
	@FindBy(name = "processCarrier")
	private WebElement proCar;
	
//payment page
	
	@FindBy(xpath = "//a[@class='bankwire']")
	private WebElement bankW;

//confirm order	

	@FindBy(xpath = "(//button[@type='submit'])[2]")
	private WebElement ConfOr;

	
// getters
	

	public WebElement getAddpro() {
		return addpro;
	}

	public WebElement getAgreeBt() {
		return agreeBt;
	}

	public WebElement getProCar() {
		return proCar;
	}

	public WebElement getBankW() {
		return bankW;
	}

	public WebElement getConfOr() {
		return ConfOr;
	}

	public static WebDriver getDriver() {
		return driver;
	}

	
}








