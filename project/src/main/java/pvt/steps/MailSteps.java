package pvt.steps;

import java.io.IOException;

import org.apache.log4j.Logger;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.After;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pvt.pages.MailPage;

public class MailSteps {

	private static final Logger logger = Logger.getLogger(MailSteps.class);
	
	private WebDriver driver;
	private MailPage mail;

	public MailSteps() {
		driver = new ChromeDriver();
		mail = new MailPage(driver);
	}

	@Given("^I am on page with \"([^\"]*)\" url$")
	public void loadPageWithUrl(String url) {
		driver.get(url);
		logger.info("info");
	}

	@When("^enter login (\"([^\"]*)\") and enter password (\"([^\"]*)\")$")
	public void enter(String login, String password) {
		mail.enterData(login, password);
	}

	@When("^Press the button$")
	public void clickButton() {
		mail.enterClick();
		logger.error("Error");
	}

	@Then("I see error")
	public void seeError() throws IOException {
		Assert.assertTrue(mail.errorDisplayed(driver));
		logger.fatal("Fatal!");		
	}

	@After
	public void afterClass() {
		driver.quit();
	}
}
