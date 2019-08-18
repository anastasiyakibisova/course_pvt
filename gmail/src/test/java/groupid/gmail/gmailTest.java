package groupid.gmail;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterGroups;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeGroups;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import groupid.gmail.LoginPage;

public class gmailTest {

	private WebDriver driver;
	private LoginPage loginPage;

	@BeforeSuite
	public void beforeTest() {
		String exePath = "D:\\install\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", exePath);
		driver = new ChromeDriver();
		loginPage = new LoginPage(driver);
	}

//	@Parameters({ "username", "password" })
//	@Test(priority = 1)
//	public void testAuthorization(String username, String password) {
//		driver.get("https://gmail.com");
//		loginPage.enterLogin(username);
//		loginPage.clickNextButton();
//		loginPage.enterPassword(driver, password);
//		loginPage.clickNextButton();
//		Assert.assertTrue(loginPage.checkMainPageOfMailService(driver));
//	}

	@Test(priority = 1)
	public void testAuthorization() {
		driver.get("https://gmail.com");
		loginPage.enterLogin("anastasiyakibisava");
		loginPage.clickNextButton();
		loginPage.enterPassword(driver, "547896321zxc");
		loginPage.clickNextButton();
		Assert.assertTrue(loginPage.checkMainPageOfMailService(driver));
	}

	@Test(priority = 2)
	public void testOutputOfMailService() {
		loginPage.clickAccount(driver);
		loginPage.clickExit(driver);
		Assert.assertTrue(loginPage.checkOutputOfMailService(driver));

	}

	@BeforeGroups("test")
	public void beforeGroup() {
		loginPage.enterPassword(driver, "547896321zxc");
		loginPage.clickNextButton();
	}

	@Test(groups = { "test" }, priority = 3)
	public void testSendMessage() {
		loginPage.clickWrite(driver);
		loginPage.enterWhom(driver, "anastasiyakibisava@gmail.com");
		loginPage.enterTheme("Тема");
		loginPage.enterText("Текст");
		loginPage.sendButton();
		Assert.assertEquals(loginPage.checkReceivingLetter(driver), "я");
	}

	@AfterGroups("test")
	public void afterGroup() {
		loginPage.clickAccount(driver);
		loginPage.clickExit(driver);
	}

	@AfterSuite
	public void afterTest() {
		driver.quit();
	}
}
