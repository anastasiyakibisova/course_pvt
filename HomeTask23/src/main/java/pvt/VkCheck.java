package pvt;

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

public class VkCheck {

	@FindBy(xpath = ".//input[@id=\"index_email\"]")
	private WebElement loginField;

	@FindBy(xpath = ".//input[@id=\"index_pass\"]")
	private WebElement passwordField;

	@FindBy(xpath = ".//button[@id=\"index_login_button\"]")
	private WebElement enter;

	@FindBy(xpath = ".//div[@class=\"top_profile_name\"]")
	private WebElement profile;

	public VkCheck(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	public void enterData(String login, String password) {
		enterText(loginField, login);
		enterText(passwordField, password);
	}

	private void enterText(WebElement element, String text) {
		element.clear();
		element.sendKeys(text);
	}

	public void enterClick() {
		enter.click();
	}

//Бессрочный токен
	public String messagePost(String id, String text) throws URISyntaxException, ClientProtocolException, IOException {
		HttpClient client = HttpClientBuilder.create().build();
		URIBuilder builder = new URIBuilder("https://api.vk.com/method/wall.post?");
		builder.setParameter("access_token","76e89b52eff4521c9b199df320768207f4a3f407678a6ae65ace389661a4fbc73e8458e0bef1cc2f64812")
				.setParameter("owner_id", id)
				.setParameter("message", text)
				.setParameter("v", "5.92");
		HttpGet request = new HttpGet(builder.build());
		HttpResponse response = client.execute(request);
		return EntityUtils.toString(response.getEntity()).replaceAll("[^0-9]+", "");
	}

	public String editedPost(String id, String text, String str)
			throws URISyntaxException, ClientProtocolException, IOException {
		HttpClient client = HttpClientBuilder.create().build();
		URIBuilder builder = new URIBuilder("https://api.vk.com/method/wall.edit?");
		builder.setParameter("access_token","76e89b52eff4521c9b199df320768207f4a3f407678a6ae65ace389661a4fbc73e8458e0bef1cc2f64812")
				.setParameter("owner_id", id)
				.setParameter("post_id", str)
				.setParameter("message", text)
				.setParameter("v", "5.92");
		HttpGet request = new HttpGet(builder.build());
		HttpResponse response = client.execute(request);
		return EntityUtils.toString(response.getEntity()).replaceAll("[^0-9]+", "");
	}

	public String deletePost(String id, String str) throws URISyntaxException, ClientProtocolException, IOException {
		HttpClient client = HttpClientBuilder.create().build();
		URIBuilder builder = new URIBuilder("https://api.vk.com/method/wall.delete?");
		builder.setParameter("access_token","76e89b52eff4521c9b199df320768207f4a3f407678a6ae65ace389661a4fbc73e8458e0bef1cc2f64812")
				.setParameter("owner_id", id)
				.setParameter("post_id", str)
				.setParameter("v", "5.92");
		HttpGet request = new HttpGet(builder.build());
		HttpResponse response = client.execute(request);
		return EntityUtils.toString(response.getEntity()).replaceAll("[^0-9]+", "");
	}

	public boolean sentMessage(String string) {
		return Integer.parseInt(string) > 0;
	}

}
