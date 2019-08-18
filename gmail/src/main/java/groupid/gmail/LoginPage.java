package groupid.gmail;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LoginPage {

	@FindBy(xpath = "//input[@type=\"email\"]")
	private WebElement email;

	@FindBy(xpath = "//span[@class=\"RveJvd snByac\"]")
	private WebElement nextButton;

	@FindBy(xpath = "//input[@type=\"password\"]")
	private WebElement password;

	@FindBy(xpath = "//div[@class=\"T-I J-J5-Ji T-I-KE L3\"]")
	private WebElement write;

	@FindBy(xpath = "//div[@class=\"gb_Jf gb_Na gb_Ag gb_g\"]")
	private WebElement account;

	@FindBy(xpath = "//a[@class=\"gb_4 gb_8f gb_gg gb_Qe gb_tb\"]")
	private WebElement exit;

	@FindBy(xpath = "//textarea[@name=\"to\"]")
	private WebElement whom;

	@FindBy(xpath = "//input[@name=\"subjectbox\"]")
	private WebElement theme;

	@FindBy(xpath = "//div[@class=\"Am Al editable LW-avf\"]")
	private WebElement text;

	@FindBy(xpath = "//div[@class=\"T-I J-J5-Ji aoO v7 T-I-atl L3\"]")
	private WebElement send;

	@FindBy(xpath = "(//div[@class=\"yW\"])[1]")
	private WebElement letter;
	
	@FindBy(xpath = "//div[@class=\"bBe\"]")
	private WebElement close;

	@FindBy(xpath = "//*[text()=\"Введите пароль\"]")
	private WebElement inputPassword;
	
	public LoginPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	private void enterText(WebElement element, String text) {
		element.clear();
		element.sendKeys(text);
	}

	public void enterLogin(String login) {
		enterText(email, login);
	}

	public void enterPassword(WebDriver driver, String pas) {
		new WebDriverWait(driver, 15).until(ExpectedConditions.visibilityOf(password));
		enterText(password, pas);
	}

	public void clickNextButton() {
		nextButton.click();
	}

	public boolean checkMainPageOfMailService(WebDriver driver) {
		new WebDriverWait(driver, 15).until(ExpectedConditions.visibilityOf(write));
		return write.isDisplayed();
	}

	public void clickAccount(WebDriver driver) {
		new WebDriverWait(driver, 15).until(ExpectedConditions.visibilityOf(account));
		account.click();
	}

	public void clickExit(WebDriver driver) {
		new WebDriverWait(driver, 15).until(ExpectedConditions.visibilityOf(exit));
		exit.click();
	}

	public boolean checkOutputOfMailService(WebDriver driver) {
		new WebDriverWait(driver, 15).until(ExpectedConditions.visibilityOf(inputPassword));
		return inputPassword.isDisplayed();
	}

	public void clickWrite(WebDriver driver) {
		new WebDriverWait(driver, 15).until(ExpectedConditions.visibilityOf(write));
		write.click();
	}

	public void enterWhom(WebDriver driver,String adress) {
		new WebDriverWait(driver, 15).until(ExpectedConditions.visibilityOf(whom));
		whom.sendKeys(adress);
	}

	public void enterTheme(String them) {
		theme.sendKeys(them);
	}

	public void enterText(String t) {
		text.sendKeys(t);
	}

	public void sendButton() {
		send.click();
	}

	public String checkReceivingLetter(WebDriver driver) {
		new WebDriverWait(driver, 50).until(ExpectedConditions.visibilityOf(letter));
		close.click();
		return letter.getText();	
	}

}
