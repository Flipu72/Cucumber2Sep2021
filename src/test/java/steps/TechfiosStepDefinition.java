package steps;

import org.openqa.selenium.support.PageFactory;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import junit.framework.Assert;
import pages.BankAndCashPage;
import pages.LoginPage;
import pages.TestBase;

public class TechfiosStepDefinition extends TestBase {

	BankAndCashPage bankandcashpage;

	@Before
	public void beforeRun() {
		initDriver();

		bankandcashpage = PageFactory.initElements(driver, BankAndCashPage.class);
	}

	@Given("^User is on techfios login page$")
	public void user_is_on_techfios_login_page() {

	}

	@When("^User enters username as \"([^\"]*)\"$")
	public void user_enters_username_as(String username) {

		bankandcashpage.enterUserName(username);
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

	}

	@When("^User enters password as \"([^\"]*)\"$")
	public void user_enters_password_as(String password) {

		bankandcashpage.enterPassword(password);
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

	}

	@When("^User clicks on signin button$")
	public void user_clicks_on_signin_button() {

		bankandcashpage.clickSignInButton();

	}

	@When("^User should land on dashboard page$")
	public void user_should_land_on_dashboard_page() throws Throwable {
		Assert.assertEquals("Dashboard- iBilling", bankandcashpage.getPageTitle());
		takeScreenshot(driver);

	}

	@When("^User clicks on BankCash button$")
	public void user_clicks_on_bankcash_button() throws Throwable {
		bankandcashpage.clickBankCashButton();
	}

	@When("^User clicks on NewAccount button$")
	public void user_clicks_on_newaccount_button() throws Throwable {
		bankandcashpage.clickNewAccountButton();
	}

	@When("^User should land on Accounts page$")
	public void user_should_land_on_Accounts_page() throws Throwable {
		Assert.assertEquals("Accounts- iBilling", bankandcashpage.getPageTitle());
		takeScreenshot(driver);
	}

	@When("^User enters Account Title as\"([^\"]*)\"$")
	public void user_enters_account_title_as(String accountTitle) throws Throwable {
		bankandcashpage.enterAccountTitle(accountTitle);
	}

	@When("^User enters Description as \"([^\"]*)\"$")
	public void user_enters_description_as(String description) throws Throwable {
		bankandcashpage.enterDescription(description);
	}

	@When("^User enters Initial Balance as\"([^\"]*)\"$")
	public void user_enters_initial_balance_as(String balance) throws Throwable {
		bankandcashpage.enterInitalBalance(balance);
	}

	@When("^User enters Account Number as\"([^\"]*)\"$")
	public void user_enters_account_number_as(String accountNumber) throws Throwable {
		bankandcashpage.enterAccountNumber(accountNumber);
	}

	@When("^User enters Contact as \"([^\"]*)\"$")
	public void user_enters_contact_as(String contact) throws Throwable {
		bankandcashpage.enterContact(contact);
	}

	@When("^User enters Phone as \"([^\"]*)\"$")
	public void user_enters_phone_as(String phone) throws Throwable {
		bankandcashpage.enterPhone(phone);
	}

	@When("^User enters Internet Banking URL as\"([^\"]*)\"$")
	public void user_enters_internet_banking_url_as(String url) throws Throwable {
		bankandcashpage.enterURL(url);
	}

	@When("^User clicks on submit button$")
	public void user_clicks_on_submit_button() throws Throwable {
		bankandcashpage.clickSubmitButton();
	}

	@When("^User should be able to validate account created successfully$")
	public void user_should_be_able_to_validate_account_created_successfully() throws Throwable {

	}

	@After
	public void tearDown() throws InterruptedException {
		Thread.sleep(3000);
		driver.close();
		driver.quit();

	}
}
