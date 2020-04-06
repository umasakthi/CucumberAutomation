package com.automation.helper;

import org.openqa.selenium.WebDriver;

import com.automation.pom.ConfirmOrder;
import com.automation.pom.HomePage;
import com.automation.pom.PlaceOrder;
import com.automation.pom.SignInPage;

public class PageObjectManager {

	public static WebDriver driver;

	public PageObjectManager(WebDriver driver) {
		this.driver = driver;
	}

	public static SignInPage sp;
	public static SignInPage hp;
	public static SignInPage po;
	public static SignInPage co;

	public static SignInPage getsp() {
		SignInPage sp = new SignInPage(driver);
		return sp;
	}

	public static HomePage gethp() {
		HomePage hp = new HomePage(driver);
		return hp;
	}

	public static PlaceOrder getpo() {
		PlaceOrder po = new PlaceOrder(driver);
				return po;
	}

	public static ConfirmOrder getco() {
		ConfirmOrder co = new ConfirmOrder(driver);
		return co;
	}

}
