package com.automation.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PlaceOrder {

	public static WebDriver driver;

	public PlaceOrder(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
// Select product
	@FindBy(xpath = "//i[@class='icon-plus']")
	private WebElement plus;

	@FindBy(id = "group_1")
	private WebElement size;

	@FindBy(id = "color_14")
	private WebElement colour;

	@FindBy(xpath = "//button[@class='exclusive']")
	private WebElement carts;

	@FindBy(xpath = "(//a[@title='Proceed to checkout'])[1]")
	private WebElement pro0;

// Place order

	@FindBy(xpath = "(//a[@title='Proceed to checkout'])[2]")
	private WebElement pro1;

	
	

	public WebElement getPlus() {
		return plus;
	}

	public WebElement getSize() {
		return size;
	}

	public WebElement getColour() {
		return colour;
	}

	public WebElement getCarts() {
		return carts;
	}

	public WebElement getPro0() {
		return pro0;
	}

	public WebElement getPro1() {
		return pro1;
	}

	public static WebDriver getDriver() {
		return driver;
	}
}
