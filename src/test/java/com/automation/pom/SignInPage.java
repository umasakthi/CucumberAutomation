package com.automation.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SignInPage {
	public static WebDriver driver;

	public SignInPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	
	@FindBy(xpath = "//a[@class='login']")
	private WebElement signIn;

	@FindBy(id = "email")
	private WebElement mail;

	@FindBy(id = "passwd")
	private WebElement pass;

	@FindBy(id = "SubmitLogin")
	private WebElement login;

	
	
	public WebElement getSignIn() {
		return signIn;
	}

	public WebElement getMail() {
		return mail;
	}

	public WebElement getPass() {
		return pass;
	}

	public WebElement getLogin() {
		return login;
	}

	public static WebDriver getDriver() {
		return driver;
	}
	

}
