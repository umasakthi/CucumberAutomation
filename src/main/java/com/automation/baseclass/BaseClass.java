package com.automation.baseclass;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class BaseClass {

	public static WebDriver driver;

	public static WebDriver browserLaunch(String browserName) {
		try {
			if (browserName.equalsIgnoreCase("chrome")) {
				System.setProperty("webdriver.chrome.driver",
						"C:\\Users\\DELL\\eclipse-workspace\\SeleniumConcept\\Drivers\\chromedriver.exe");
				driver = new ChromeDriver();
				driver.manage().window().maximize();

			} else if (browserName.equalsIgnoreCase("ie")) {
				System.setProperty("webdriver.ie.driver",
						"C:\\Users\\DELL\\eclipse-workspace\\SeleniumConcept\\Drivers\\IEDriverServer.exe");
				driver = new InternetExplorerDriver();
				driver.manage().window().maximize();
			} else {
				System.out.println("Invalid Browser");
			}

		} catch (Exception e) {
			e.printStackTrace();
		}
		return driver;
	}
//driver methods

	public static void getUrl(String url) {
		driver.get(url);
		driver.manage().window().maximize();

	}

	public static void close() {
		driver.close();
	}

	public static void quit() {
		driver.quit();
	}

//ClickMethod	

	public static void mouseClick(WebElement element) {
		element.click();
	}

//Input value in element

	public static void inputvalueToWebElement(WebElement element, String value) {
		element.sendKeys(value);
	}

//Dropdown

	public static void selectDropDown(WebElement element, String option, String input) {
		Select s = new Select(element);

		if (option.equalsIgnoreCase("value")) {
			s.selectByValue(input);
		}

		else if (option.equalsIgnoreCase("VisibleText")) {
			s.selectByVisibleText(input);
		}

		else if (option.equalsIgnoreCase("Index")) {
			int i = Integer.parseInt(input);
			s.selectByIndex(i);
		}
	}

//action move to element
	public static void actionMethod(WebElement element, WebElement element1, String option) {
		Actions ac = new Actions(driver);

		if (option.equalsIgnoreCase("Element")) {
			ac.moveToElement(element).perform();
			ac.click(element1).perform();
		}

		else if (option.equalsIgnoreCase("context")) {
		ac.contextClick(element).perform();
		}

	}

	// driver actions switch to frame

	public static void switchToFrame() {
		driver.switchTo().frame(0);
	}

	// driver switch to default content

	public static void SwitchToDefaultContent() {
		driver.switchTo().defaultContent();
	}

// navigate methods

	public void back() {
		driver.navigate().back();
	}

	public void forward() {
		driver.navigate().forward();
	}

	public void refresh() {
		driver.navigate().refresh();
	}

}