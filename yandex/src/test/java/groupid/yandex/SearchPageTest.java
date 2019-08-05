package groupid.yandex;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SearchPageTest {

	private WebDriver driver;
	private SearchPage search;

	@Before
	public void setUp() {
		String exePath = "D:\\install\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", exePath);
		driver = new ChromeDriver();
		search = new SearchPage(driver);
	}

	@After
	public void tearDown() {
		driver.quit();
	}

	@Test
	public void testOpenPage() {
		driver.get("https://yandex.by/");
		search.enterTextSearch("переводчик онлайн");
		search.clickFindButton();
		Assert.assertTrue(search.translationWindowIsDisplayed(driver));
	}

	@Test
	public void testTranslate() {
		driver.get("https://yandex.by/");
		search.enterTextSearch("переводчик онлайн");
		search.clickFindButton();
		String text1 = "Текст";
		String text2 = "text";
		search.inputText(text1);
		Assert.assertEquals(search.translationText(driver), text2);
	}

	@Test
	public void testTranslateOut() {
		driver.get("https://yandex.by/");
		search.enterTextSearch("переводчик онлайн");
		search.clickFindButton();
		String text1 = "Text";
		String text2 = "текст";
		search.inputText(text1);
		Assert.assertEquals(search.translationText(driver), text2);
	}

	@Test
	public void testTranslateChoiseLanguage() {
		driver.get("https://yandex.by/");
		search.enterTextSearch("переводчик онлайн");
		search.clickFindButton();
		String text1 = "Василек";
		String text2 = "васілёк";
		search.inputText(text1);
		search.translateChange();
		search.translateLanguageChoice(driver);
		search.translateLanguageBy(driver);
		Assert.assertEquals(search.translationText(driver), text2);
	}
	
	@Test
	public void testTranslateSwap() {
		driver.get("https://yandex.by/");
		search.enterTextSearch("переводчик онлайн");
		search.clickFindButton();
		String text1 = "автомобиль";
		search.translateLanguageChoice1(driver);
		search.translateLanguageRu(driver);
		search.inputText(text1);
		search.translateChange();
		search.translateLanguageChoice(driver);
		search.translateLanguageBy(driver);
		search.swapButton();
		search.buttonEnter();
		Assert.assertEquals(search.translationText(driver), text1);
	}
}
