package groupid.yandex;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SearchPage {

	@FindBy(xpath = ".//input[@class=\"input__control input__input\"]")
	private WebElement searchLine;

	@FindBy(xpath = ".//div[@class=\"search2__button\"]")
	private WebElement findButton;

	@FindBy(xpath = ".//div[@class=\"translate-form__input-part typo typo_text_l i-bem typo_js_inited\"]")
	private WebElement objectPage;

	@FindBy(xpath = ".//textarea[@class=\"textarea__control\"]")
	private WebElement textInput;

	@FindBy(xpath = ".//div[@class=\"translate-form__result-text typo typo_text_xl i-bem typo_js_inited\"]")
	private WebElement textOutput;

	@FindBy(xpath = ".//span[@class=\"select2 select2_type_radio select2_theme_default select2_size_m select2_popup_yes select2_text_vary select2_view_translate translate-form__select translate-form__select-to i-bem _popup2-destructor _popup2-destructor_js_inited select2_js_inited\"]")
	private WebElement translateLanguage;

	@FindBy(xpath = "/html/body/div[3]/div[1]/div[2]/div[1]/div[1]/ul/li[1]/div/div[2]/div/div[1]/div[1]/span[1]/button")
	private WebElement translateLanguage1;

	@FindBy(xpath = "(//*[.=\"Белорусский\"])[3]")
	private WebElement translateLanguageBy;
	
	@FindBy(xpath = "(//*[.=\"Русский\"])[1]")
	private WebElement translateLanguageRu;
	
	@FindBy(xpath = ".//div[@class=\"translate-form__reverse-button\"]")
	private WebElement translateChange;
	
	@FindBy(xpath = ".//div[@class=\"translate-form__reverse-button\"]")
	private WebElement translateSwap;
	
	public SearchPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	private void enterText(WebElement element, String text) {
		element.clear();
		element.sendKeys(text);
	}

	public void enterTextSearch(String text) {
		enterText(searchLine, text);
	}

	public void clickFindButton() {
		findButton.click();
	}

	public boolean translationWindowIsDisplayed(WebDriver driver) {
		new WebDriverWait(driver, 50).until(ExpectedConditions.visibilityOf(objectPage));
		return objectPage.isDisplayed();
	}

	public void inputText(String text) {
		enterText(textInput, text);
	}

	public String translationText(WebDriver driver) {
		new WebDriverWait(driver, 10).until(ExpectedConditions.visibilityOf(textOutput));
		String textTranslite = textOutput.getText();
		return textTranslite;
	}

	public void translateLanguageChoice(WebDriver driver) {
		new WebDriverWait(driver, 5).until(ExpectedConditions.visibilityOf(translateLanguage));
		translateLanguage.click();
	}
	
	public void translateLanguageChoice1(WebDriver driver) {
		new WebDriverWait(driver, 5).until(ExpectedConditions.visibilityOf(translateLanguage));
		translateLanguage1.click();
	}

	public void translateLanguageBy(WebDriver driver) {
		new WebDriverWait(driver, 5).until(ExpectedConditions.visibilityOf(translateLanguageBy));
		translateLanguageBy.click();
	}
	
	public void translateLanguageRu(WebDriver driver) {
		new WebDriverWait(driver, 5).until(ExpectedConditions.visibilityOf(translateLanguageBy));
		translateLanguageRu.click();
	}

	public void translateChange() {
		translateChange.click();
	}
	
	public void swapButton() {
		translateSwap.click();
	}
	
	public void buttonEnter() {
		textInput.sendKeys(Keys.ENTER);
	}
}
