package com.automation.stepdefinition;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import com.automation.baseclass.BaseClass;
import com.automation.helper.FileReaderManager;
import com.automation.helper.PageObjectManager;
import com.automation.runner.Runner;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.*;
import gherkin.formatter.model.Scenario;
import junit.framework.Assert;

public class StepDefinition extends BaseClass {
	public static WebDriver driver = Runner.driver;
	PageObjectManager pom = new PageObjectManager(driver);

//SignIn Page
	@Given("^user to launch the browser$")
	public void user_to_launch_the_browser() throws Throwable {
		System.out.println("Browser Launched");
	}

	@Then("^user to launch the application$")
	public void user_to_launch_the_application() throws Throwable {

		System.out.println("Application Launched");
	}

	@Given("^user clicks on Signin button$")
	public void user_clicks_on_Signin_button() throws Throwable {
		String url = FileReaderManager.getInstance().getcrInstance().geturl();
		driver.get(url);
		Thread.sleep(5000);
		mouseClick(pom.getsp().getSignIn());
		Thread.sleep(2000);
	}

	@When("^user enters the valid username \"([^\"]*)\" in the username field$")
	public void user_enters_the_valid_username_in_the_username_field(String username) throws Throwable {
		inputvalueToWebElement(pom.getsp().getMail(), username);
		Thread.sleep(2000);
	}

	@When("^User enters valid password \"([^\"]*)\" in the password field$")
	public void user_enters_valid_password_in_the_password_field(String password) throws Throwable {
		inputvalueToWebElement(pom.getsp().getPass(), password);
		Thread.sleep(2000);

	}

	@When("user clicks on login button")
	public void user_clicks_on_login_button() throws Throwable {
		mouseClick(pom.getsp().getLogin());
		Thread.sleep(5000);

	}

//Home page	
	@Then("User confirms the home page is launched.")
	public void user_confirms_the_home_page_is_launched() {
	}

	@Given("^user navigates to tshirt in women option$")
	public void user_navigates_to_tshirt_in_women_option() throws Throwable {
		actionMethod(pom.gethp().getWomen(), pom.gethp().getTshirt(), "element");
		Thread.sleep(7000);

	}

	@When("^user clicks on tshirt image to book$")
	public void user_clicks_on_tshirt_image_to_book() throws Throwable {
		mouseClick(pom.gethp().getTsimg());
		Thread.sleep(3000);
		switchToFrame();
		Thread.sleep(5000);
	}

// Place order
	@When("^user selects quantity of tshirt$")
	public void user_selects_quantity_of_tshirt() throws Throwable {
		mouseClick(pom.getpo().getPlus());
		Thread.sleep(3000);
	}

	@When("^user selects size of tshirt$")
	public void user_selects_size_of_tshirt() throws Throwable {
		selectDropDown(pom.getpo().getSize(), "value", "3");
		Thread.sleep(3000);
	}

	@When("^user selects colour of tshirt$")
	public void user_selects_colour_of_tshirt() throws Throwable {
		mouseClick(pom.getpo().getColour());
		Thread.sleep(3000);
	}

	@When("^user adds tshirt to cart$")
	public void user_adds_tshirt_to_cart() throws Throwable {
		mouseClick(pom.getpo().getCarts());
		Thread.sleep(3000);
	}

	@When("^user proceeds to checkout$")
	public void user_proceeds_to_checkout() throws Throwable {
		mouseClick(pom.getpo().getPro0());
		Thread.sleep(3000);
	}

	@Then("^user confirms tshirt checkout$")
	public void user_confirms_tshirt_checkout() throws Throwable {
	}

//// ConfirmOrder Page

	@Given("^user proceeds to shipping page$")
	public void user_proceeds_to_shipping_page() throws Throwable {
		mouseClick(pom.getpo().getPro1());
		Thread.sleep(3000);
		mouseClick(pom.getco().getAddpro());
		Thread.sleep(3000);
	}

	@And("^user agrees to terms of service$")
	public void user_agrees_to_terms_of_service() throws Throwable {
		mouseClick(pom.getco().getAgreeBt());
		Thread.sleep(3000);
	}

	@And("^User proceeds to payment page$")
	public void user_proceeds_to_payment_page() throws Throwable {
		mouseClick(pom.getco().getProCar());
		Thread.sleep(3000);
	}

	@And("^user selects to bankwire$")
	public void user_selects_to_bankwire() throws Throwable {
		mouseClick(pom.getco().getBankW());
		Thread.sleep(3000);
		mouseClick(pom.getco().getConfOr());
		Thread.sleep(3000);

	}

	@Then("^User confirms order\\.$")
	public void user_confirms_order() throws Throwable {

	Assert.assertEquals("", "  ");
	}

}
