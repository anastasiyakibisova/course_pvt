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
import pvt.pages.VkPage;

public class VkSteps {

	private static final Logger logger = Logger.getLogger(VkSteps.class);
	
	private WebDriver driver;
	private VkPage vk;

	public VkSteps() {
		driver = new ChromeDriver();
		vk = new VkPage(driver);
	}

	@Given("^I am on page with \"([^\"]*)\" url$")
	public void loadPageWithUrl(String url) {
		driver.get(url);
		logger.info("info");
	}

	@When("^enter login (\"([^\"]*)\") and enter password (\"([^\"]*)\")$")
	public void enter(String login, String password) {
		vk.enterData(login, password);
	}

	@When("^Press the button$")
	public void clickButton() {
		vk.enterClick();
		logger.error("Error");
	}

	@Then("I see error")
	public void seeError() throws IOException {
		Assert.assertTrue(vk.errorDisplayed(driver));
		logger.fatal("Fatal!");		
	}

	@After
	public void afterClass() {
		driver.quit();
	}
}
