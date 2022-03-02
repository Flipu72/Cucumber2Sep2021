package steps;

import org.junit.After;
import org.junit.Before;
 
import org.openqa.selenium.support.PageFactory;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import junit.framework.Assert;
import pages.LoginPage;
import pages.TestBase;

public class TechfiosStepDefinition extends TestBase {
	LoginPage loginPage;

	@Before
	public void beforeRun() {
		initDriver();
		loginPage = PageFactory.initElements(driver, LoginPage.class);
	}

	@Given("^User is on techfios login page$")
	public void user_is_on_techfios_login_page() {
 
	}

	@When("^User enters username as \"([^\"]*)\"$")
	public void user_enters_username_as(String username) {
		loginPage.enterUserName(username);
	 
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

	}

	@When("^User enters password as \"([^\"]*)\"$")
	public void user_enters_password_as(String password) {
		loginPage.enterPassword(password);
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

	}
	
	@When("^User clicks on signin button$")
	public void user_clicks_on_signin_button() {
		loginPage.clickSignInButton();

	}
	
	@And("^User should land on dashboard page$")
	public void user_should_land_on_dashboard_page() throws Throwable {
		Assert.assertEquals("Dashboard- iBilling", loginPage.getPageTitle());
	//	takeScreenshot(driver);

	}
	
 	@Then("^User should not land on dashboard page$")
 	public void user_should_not_land_on_dashboard_page() throws Throwable {
 		Assert.assertEquals("Dashboard- iBilling", loginPage.getPageTitle());

 	}
	
	@After
	public void tearDown() {
		driver.close();
		driver.quit();

	}
}
