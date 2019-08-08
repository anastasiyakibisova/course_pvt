package groupid.tutby;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;

public class MailboxTest {

	private WebDriver driver;
	private LoginPage loginPage;

	@Test
	public void testCheckNumberOfIncomingEmails() {
		driver.get("https://www.tut.by/");
		loginPage.clickMail();
		loginPage.enterData("trial123", "547896321");
		loginPage.clickEnterButton();
		loginPage.clickInbox(driver);
		Assert.assertTrue(loginPage.checkNumber());

	}

	@BeforeTest
	public void beforeTest() {
		String exePath = "D:\\install\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", exePath);
		driver = new ChromeDriver();
		loginPage = new LoginPage(driver);
	}

	@AfterTest
	public void afterTest() {
		driver.quit();
	}

}
