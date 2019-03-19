package pvt;

import java.io.IOException;
import java.net.URISyntaxException;

import org.apache.http.client.ClientProtocolException;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class VkCheckTest {

	private WebDriver driver;
	private VkCheck vkCheck;

	public VkCheckTest() {
	}

	@Before
	public void setUp() {
		String exePath = "D:\\install\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", exePath);
		driver = new ChromeDriver();
		vkCheck = new VkCheck(driver);
		driver.manage().window().maximize();
	}

	@After
	public void tearDown() {
		driver.quit();
	}

    @Test
    public void testPosting() throws ClientProtocolException, URISyntaxException, IOException {
        driver.get("https://vk.com");
        vkCheck.enterData("+375297896791", "2h2ct2ciy223");
        vkCheck.enterClick();
        String number = vkCheck.messagePost("85033573", "Hello");
        Assert.assertTrue(vkCheck.sentMessage(number));
    }

    @Test
    public void testEditing() throws ClientProtocolException, URISyntaxException, IOException {
        driver.get("https://vk.com");
        vkCheck.enterData("+375297896791", "2h2ct2ciy223");
        vkCheck.enterClick();
        String number = vkCheck.messagePost("85033573", "Hello");
        String str = vkCheck.editedPost("85033573", "Hi", number);
        Assert.assertTrue(vkCheck.sentMessage(str));
    }

	@Test
	public void testDeleting() throws ClientProtocolException, URISyntaxException, IOException {
		driver.get("https://vk.com");
		vkCheck.enterData("+375297896791", "2h2ct2ciy223");
		vkCheck.enterClick();
		String number = vkCheck.messagePost("85033573", "Hello");
		vkCheck.editedPost("85033573", "Hi", number);
		String str = vkCheck.deletePost("85033573", number);
		Assert.assertTrue(vkCheck.sentMessage(str));
	}
	
	@Test
    public void testPostingImage() throws ClientProtocolException, URISyntaxException, IOException {
        driver.get("https://vk.com");
        vkCheck.enterData("+375297896791", "2h2ct2ciy223");
        vkCheck.enterClick();
        String number = vkCheck.messagePost("85033573", "Hello");
        Assert.assertTrue(vkCheck.sentMessage(number));
    }
}
