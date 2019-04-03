package pvt.pages;

import static org.testng.Assert.assertTrue;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.xml.parsers.ParserConfigurationException;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.xml.sax.SAXException;

import pvt.model.Authentication;
import pvt.sax.Sax;

public class FlagThreeLetters {

	private MailPage mail;
	private WebDriver driver;
	private List<Authentication> sites;
	private Sax sax;
	private PagesFactory pf;

	@Before
	public void setUp() throws Exception {
		driver = new ChromeDriver();
		mail = new MailPage(driver);
		sites = new ArrayList<Authentication>();
		sax = new Sax();
		sites = sax.SaxParser();
		pf = new PagesFactory(driver);
		pf.getInstans(sites.get(0).getName());

	}

	@After
	public void tearDown() throws Exception {
		driver.quit();
	}

	@Test
	public void testFlagThreeLetters() throws ParserConfigurationException, SAXException, IOException {
		driver.get(sites.get(0).getName());
		mail.enterData(sites.get(0).getLogin(), sites.get(0).getPassword());
		mail.enterClick();
		assertTrue(mail.isLogoutLinkDisplayd(driver));
		mail.clickFlag(driver);

	}
}
