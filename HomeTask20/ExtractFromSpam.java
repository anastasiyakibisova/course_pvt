package core;

import static org.junit.Assert.assertTrue;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ExtractFromSpam {

	private LoginPage loginPage;
	private WebDriver driver;

	@Before
	public void setUp() throws Exception {
		String exePath = "D:\\install\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", exePath);
		driver = new ChromeDriver();
		loginPage = new LoginPage(driver);
		driver.manage().window().maximize();
	}

	@After
	public void tearDown() throws Exception {
		driver.quit();
	}

	@Test
	public void test() {
		driver.get("https://mail.ru/");
		loginPage.enterData("anastasiyakibisova", "7896791qaz");
		loginPage.clickEnterButton();
		assertTrue(loginPage.isLogoutLinkDisplayd(driver));
		loginPage.clickSpam(driver);
		loginPage.clickItemSelectionSpam(driver);
		loginPage.clickNoSpam();
		assertTrue(loginPage.messageSpamDisplayd(driver));
	}
}
