package pages;

import java.util.Random;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class BankAndCashPage {

	WebDriver driver;

	public BankAndCashPage(WebDriver driver) {
		this.driver = driver;
	}

	// Element Library
	@FindBy(how = How.XPATH, using = "//input[@id='username']")
	WebElement UserName;
	@FindBy(how = How.XPATH, using = "//input[@id='password']")
	WebElement Password;
	@FindBy(how = How.XPATH, using = "//button[@name='login']")
	WebElement SignInButton;
	@FindBy(how = How.XPATH, using = "//*[@id=\"side-menu\"]/li[10]/a/span[1]")
	WebElement BankCashButton;
	@FindBy(how = How.XPATH, using = "//ul[@id=\"side-menu\"]/li[10]/ul/li[1]/a")
	WebElement NewAccountButton;
	@FindBy(how = How.XPATH, using = "//input[@id=\"account\"]")
	WebElement AccountTitle;
	@FindBy(how = How.XPATH, using = "//input[@id=\"description\"]")
	WebElement Description;
	@FindBy(how = How.XPATH, using = "//input[@id=\"balance\"]")
	WebElement InitialBalance;
	@FindBy(how = How.XPATH, using = "//input[@id=\"account_number\"]")
	WebElement AccountNumber;
	@FindBy(how = How.XPATH, using = "//input[@id=\"contact_person\"]")
	WebElement ContactPerson;
	@FindBy(how = How.XPATH, using = "//input[@id=\"contact_phone\"]")
	WebElement Phone;
	@FindBy(how = How.XPATH, using = "//input[@id=\"ib_url\"]")
	WebElement InternetBankingURL;
	@FindBy(how = How.XPATH, using = "//form[@name=\"accadd\"]/button")
	WebElement SubmitButton;

	// Methods to interact with the elements
	public void enterUserName(String username) {
		UserName.sendKeys(username);
	}

	public void enterPassword(String password) {
		Password.sendKeys(password);
	}

	public void clickSignInButton() {
		SignInButton.click();
	}

	public String getPageTitle() {
		return driver.getTitle();
	}

	public void clickBankCashButton() {
		BankCashButton.click();
	}

	public void clickNewAccountButton() {
		NewAccountButton.click();
	}

	public String getPageTitle1() {
		return driver.getTitle();
	}

	public void enterAccountTitle(String accountTitle) {
		AccountTitle.sendKeys(accountTitle + randomGenerator(99));
	}

	public void enterDescription(String description) {
		Description.sendKeys(description);
	}

	public void enterInitalBalance(String balance) {
		InitialBalance.sendKeys(balance);
	}

	public void enterAccountNumber(String accountNumber) {
		AccountNumber.sendKeys(accountNumber + randomGenerator(999));
	}

	public void enterContact(String contact) {
		ContactPerson.sendKeys(contact);
	}

	public void enterPhone(String phone) {
		Phone.sendKeys(phone + randomGenerator(999));
	}

	public void enterURL(String url) {
		InternetBankingURL.sendKeys(url);
	}

	public void clickSubmitButton() {
		SubmitButton.click();
	}

	public int randomGenerator(int maxnumber) {
		Random rnd = new Random();
		int randomNo = rnd.nextInt(maxnumber);
		return randomNo;
	}
}
