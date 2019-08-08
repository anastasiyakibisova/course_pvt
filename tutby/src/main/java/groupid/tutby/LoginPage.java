package groupid.tutby;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LoginPage {

	@FindBy(xpath = ".//a[@title=\"Почта\"]")
	private WebElement mail;

	@FindBy(xpath = "//input[@type=\"text\"]")
	private WebElement loginField;

	@FindBy(xpath = "//input[@type=\"password\"]")
	private WebElement paasordField;

	@FindBy(xpath = "//input[@class=\"button loginButton gradientforbutton\"]")
	private WebElement loginButton;

	@FindBy(xpath = "//*[.=\"Входящие\"]")
	private WebElement inbox;

	@FindBy(xpath = "//div[@class=\"mail-MessageSnippet-Content\"]")
	private List<WebElement> inboxList;

	@FindBy(xpath = "(//span[@class=\"mail-NestedList-Item-Info-Extras\"])[1]")
	private WebElement List;

	public LoginPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	public void clickMail() {
		mail.click();
	}

	private void enterText(WebElement element, String text) {
		element.clear();
		element.sendKeys(text);
	}

	public void enterData(String login, String password) {
		enterText(loginField, login);
		enterText(paasordField, password);
	}

	public void clickEnterButton() {
		loginButton.click();
	}

	public void clickInbox(WebDriver driver) {
		new WebDriverWait(driver, 15).until(ExpectedConditions.visibilityOf(inbox));
		inbox.click();
	}

	private List<WebElement> getInboxList() {
		return inboxList;
	}

	public boolean checkNumber() {
		int count = getInboxList().size();
		String num = List.getText().replaceAll("[^0-9]", "");
		System.out.println(count == 0 ? "В папке «Входящие» нет писем" : "В папке «Входящие» писем: " + num);
		return true;
	}

}