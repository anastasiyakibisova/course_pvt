package pvt.Task25;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LoginPage {

	@FindBy(xpath = "//*[@id=\"mailbox:password\"]")
	private WebElement paasordField;

	@FindBy(xpath = "//*[@id=\"mailbox:login\"]")
	private WebElement loginField;

	@FindBy(xpath = "//*[@id=\"mailbox:submit\"]/input")
	private WebElement loginButton;

	@FindBy(xpath = "//*[@id=\"PH_logoutLink\"]")
	private WebElement logoutLink;

	@FindBy(xpath = ".//*[@class=\"js-item-checkbox b-datalist__item__cbx\"]")
	private WebElement itemSelection;

	@FindBy(xpath = "//*[@id=\"b-letters\"]/div/div[5]/div/div[2]/div[1]/div/a/div[1]")
	private WebElement itemSelectionSpam;

	@FindBy(xpath = "//*[@id=\"b-toolbar__right\"]/div[2]/div/div[2]/div[3]")
	private WebElement spamButton;

	@FindBy(xpath = "//*[@id=\"b-toolbar__right\"]/div[3]/div/div[2]/div[3]/div/span")
	private WebElement noSpamButton;

	@FindBy(xpath = "//*[@id=\"jsHtml\"]/body/div[1]/div[1]/div/span")
	private WebElement messageSpam;

	@FindBy(xpath = "//*[@id=\"b-nav_folders\"]/div/div[5]/a/span[2]")
	private WebElement spam;

	@FindBy(xpath = "//*[@id=\"b-toolbar__left\"]/div/div/div[2]/div/a")
	private WebElement writeButton;

	@FindBy(xpath = "(.//*[@class=\"js-input compose__labels__input\"])[2]")
	private WebElement whom;

	@FindBy(xpath = ".//*[@id=\"toolkit-155186487400344composeFrame\"]")
	private WebElement frame;

	@FindBy(xpath = ".//*[@class=\"b-input\"]")
	private WebElement theme;

	@FindBy(xpath = "(.//*[@data-bem=\"b-toolbar__btn\"])[10]")
	private WebElement send;

	@FindBy(xpath = "//*[@id=\"b-compose__sent\"]/div/div[1]/div")
	private WebElement messageSend;

	@FindBy(xpath = "(.//*[@data-act=\"flag\"])[1]")
	private WebElement flag1;

	@FindBy(xpath = "(.//*[@data-act=\"flag\"])[2]")
	private WebElement flag2;

	@FindBy(xpath = "(.//*[@data-act=\"flag\"])[3]")
	private WebElement flag3;

	@FindBy(xpath = ".//*[@data-title=\"Помеченные флажком\"]")
	private WebElement allFlag;

	@FindBy(xpath = ".//*[@class=\"b-checkbox__box\"]")
	private WebElement allSelect;

	@FindBy(xpath = "(.//*[@data-mnemo=\"ctrl\"])[6]")
	private WebElement still;

	@FindBy(xpath = ".//*[@data-text=\"Снять флажок\"]")
	private WebElement uncheckBox;

	public LoginPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	public void enterData(String login, String password) {
		enterText(loginField, login);
		enterText(paasordField, password);
	}

	public void clickEnterButton() {
		loginButton.click();
	}

	public boolean isLogoutLinkDisplayd(WebDriver driver) {
		new WebDriverWait(driver, 5).until(ExpectedConditions.visibilityOf(logoutLink));
		return logoutLink.isDisplayed();
	}

	private void enterText(WebElement element, String text) {
		element.clear();
		element.sendKeys(text);
	}

	public void clickItemSelection(WebDriver driver) {
		new WebDriverWait(driver, 5).until(ExpectedConditions.visibilityOf(itemSelection));
		itemSelection.click();
	}

	public void clickSpamButton() {
		spamButton.click();
	}

	public boolean messageSpamDisplayd(WebDriver driver) {
		new WebDriverWait(driver, 5).until(ExpectedConditions.visibilityOf(messageSpam));
		return messageSpam.isDisplayed();
	}

	public void clickSpam(WebDriver driver) {
		new WebDriverWait(driver, 5).until(ExpectedConditions.visibilityOf(spam));
		spam.click();
	}

	public void clickItemSelectionSpam(WebDriver driver) {
		new WebDriverWait(driver, 5).until(ExpectedConditions.visibilityOf(itemSelectionSpam));
		itemSelectionSpam.click();
	}

	public void clickNoSpam() {
		noSpamButton.click();
	}

	public void clickWriteButton(WebDriver driver) {
		new WebDriverWait(driver, 5).until(ExpectedConditions.visibilityOf(writeButton));
		writeButton.click();
	}

	public void clickWhom(WebDriver driver) {
		new WebDriverWait(driver, 5).until(ExpectedConditions.visibilityOf(whom));
		whom.click();
	}

	public void enterWhom(String adress) {
		whom.sendKeys(adress);
	}

	public void enterTheme(String them) {
		theme.sendKeys(them);
	}

	public void enterMailText(String text) {
		theme.sendKeys(Keys.TAB, text);
	}

	public void sendButton() {
		send.click();
	}

	public boolean messageSend(WebDriver driver) {
		new WebDriverWait(driver, 5).until(ExpectedConditions.visibilityOf(messageSend));
		return messageSend.isDisplayed();
	}

	public void clickFlag(WebDriver driver) {
		new WebDriverWait(driver, 5).until(ExpectedConditions.visibilityOf(flag1));
		flag1.click();
		flag2.click();
		flag3.click();
	}

	public void clickAllFlag(WebDriver driver) {
		new WebDriverWait(driver, 5).until(ExpectedConditions.visibilityOf(allFlag));
		allFlag.click();
	}

	public void clickAllSelect() {
		allSelect.click();
	}

	public void clickStill() {
		still.click();
	}

	public void clickUncheckBox() {
		uncheckBox.click();
	}
}
