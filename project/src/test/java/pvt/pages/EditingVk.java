package pvt.pages;

import static org.testng.Assert.assertTrue;

import java.io.IOException;
import java.net.URISyntaxException;
import java.util.ArrayList;
import java.util.List;

import org.apache.http.client.ClientProtocolException;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import pvt.dao.Configuration;
import pvt.dao.Infromation;
import pvt.model.Authentication;
import pvt.sax.Sax;

public class EditingVk {

	private VkPage vk;
	private WebDriver driver;
	private List<Authentication> sites;
	private Sax sax;
	private Infromation inform;
	private PagesFactory pf;

	@Before
	public void setUp() throws Exception {
		driver = new ChromeDriver();
		vk = new VkPage(driver);
		sites = new ArrayList<Authentication>();
		sax = new Sax();
		sites = sax.SaxParser();
		pf = new PagesFactory(driver);
		pf.getInstans(sites.get(1).getName());
		inform = Configuration.infomationSite(2);

	}

	@After
	public void tearDown() throws Exception {
		driver.quit();
	}

	@Test
	public void testEdit() throws ClientProtocolException, URISyntaxException, IOException {
		driver.get(sites.get(1).getName());
		vk.enterData(sites.get(1).getLogin(), sites.get(1).getPassword());
		vk.enterClick();
		String number = vk.messagePost(inform.getToken(), inform.getNumber(), inform.getText1());
		String str = vk.editedPost(inform.getToken(), inform.getNumber(), inform.getText2(), number);
		assertTrue(vk.sentMessage(str));
	}
}
