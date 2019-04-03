package pvt.pages;

import java.io.IOException;
import java.net.URISyntaxException;

import org.apache.http.HttpResponse;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.utils.URIBuilder;
import org.apache.http.impl.client.HttpClientBuilder;
import org.apache.http.util.EntityUtils;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class VkPage extends ImplementationPage {

	@FindBy(xpath = ".//input[@id=\"index_email\"]")
	private WebElement loginField;

	@FindBy(xpath = ".//input[@id=\"index_pass\"]")
	private WebElement passwordField;

	@FindBy(xpath = ".//button[@id=\"index_login_button\"]")
	private WebElement enter1;

	@FindBy(xpath = ".//div[@class=\"top_profile_name\"]")
	private WebElement profile;

	@FindBy(xpath = ".//div[@class=\"msg_text\"]")
	private WebElement error;
	
	public VkPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	@Override
	public void enterData(String login, String password) {
		enterText(loginField, login);
		enterText(passwordField, password);
	}

	private void enterText(WebElement element, String text) {
		element.clear();
		element.sendKeys(text);
	}

	@Override
	public void enterClick() {
		enter1.click();
	}

	public String messagePost(String token, String number, String text) throws URISyntaxException, ClientProtocolException, IOException {
		HttpClient client = HttpClientBuilder.create().build();
		URIBuilder builder = new URIBuilder("https://api.vk.com/method/wall.post?");
		builder.setParameter("access_token",token)
				.setParameter("owner_id", number)
				.setParameter("message", text)
				.setParameter("v", "5.92");
		HttpGet request = new HttpGet(builder.build());
		HttpResponse response = client.execute(request);
		return EntityUtils.toString(response.getEntity()).replaceAll("[^0-9]+", "");
	}

	public String editedPost(String token, String number, String text, String str) throws URISyntaxException, ClientProtocolException, IOException {
		HttpClient client = HttpClientBuilder.create().build();
		URIBuilder builder = new URIBuilder("https://api.vk.com/method/wall.edit?");
		builder.setParameter("access_token", token)
				.setParameter("owner_id", number)
				.setParameter("post_id", str)
				.setParameter("message", text)
				.setParameter("v", "5.92");
		HttpGet request = new HttpGet(builder.build());
		HttpResponse response = client.execute(request);
		return EntityUtils.toString(response.getEntity()).replaceAll("[^0-9]+", "");
	}

	public String deletePost(String token, String number, String str) throws URISyntaxException, ClientProtocolException, IOException {
		HttpClient client = HttpClientBuilder.create().build();
		URIBuilder builder = new URIBuilder("https://api.vk.com/method/wall.delete?");
		builder.setParameter("access_token", token)
				.setParameter("owner_id", number)
				.setParameter("post_id", str)
				.setParameter("v", "5.92");
		HttpGet request = new HttpGet(builder.build());
		HttpResponse response = client.execute(request);
		return EntityUtils.toString(response.getEntity()).replaceAll("[^0-9]+", "");
	}

	public boolean sentMessage(String string) {
		return Integer.parseInt(string) > 0;
	}
	
	public boolean errorDisplayed(WebDriver driver) {
		new WebDriverWait(driver, 5).until(ExpectedConditions.visibilityOf(error));
		return error.isDisplayed();
	}

	@Override
	public void readMessage() {
	}

	@Override
	public void writeMessage() {

	}

	@Override
	public void deleteMessange() {
	}

	@Override
	public boolean worksWith(String webSiteName) {
		return webSiteName == "vk.com";
	}

}
