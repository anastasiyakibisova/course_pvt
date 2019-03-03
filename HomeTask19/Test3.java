package core;

import java.util.List;
import java.util.Set;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Test3 {

	private WebDriver driver;

	@Before
	public void setUp() throws Exception {
		String exePath = "D:\\install\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", exePath);
		driver = new ChromeDriver();
	}

	@After
	public void tearDown() throws Exception {
		driver.quit();
	}

	@Test
	public void test() throws InterruptedException {
		driver.get("https://www.booking.com");
		WebElement account = driver.findElement(By.xpath("(.//*[@class=\"sign_in_wrapper\"])[2]"));
		account.click();
		Thread.sleep(1000);
		WebElement email = driver.findElement(By.xpath("//*[@id=\"username\"]"));
		email.clear();
		email.sendKeys("sol911@list.ru");
		WebElement button = driver
				.findElement(By.xpath("//*[@id=\"root\"]/div/div/div/div[1]/div[2]/div/div/form/div[3]/button"));
		button.click();
		Thread.sleep(1000);
		WebElement password = driver.findElement(By.xpath("//*[@id=\"password\"]"));
		password.clear();
		password.sendKeys("547896321qaz");
		Thread.sleep(1000);
		button = driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/div/div[1]/div[2]/div/div/form/button"));
		button.click();
		Thread.sleep(2000);
		WebElement searchField = driver.findElement(By.xpath(".//*[@id=\"ss\"]"));
		searchField.clear();
		searchField.sendKeys("Париж");
		Thread.sleep(1000);
		WebElement data = driver.findElement(By.xpath(
				"(.//*[@class=\"sb-date-field__icon sb-date-field__icon-btn bk-svg-wrapper calendar-restructure-sb\"])[1]"));
		data.click();
		WebElement dataArival = driver.findElement(
				By.xpath("//*[@id=\"frm\"]/div[1]/div[2]/div[2]/div/div/div[3]/div[1]/table/tbody/tr[3]/td[3]"));
		dataArival.click();
		WebElement dataDeparture = driver.findElement(
				By.xpath("//*[@id=\"frm\"]/div[1]/div[2]/div[2]/div/div/div[3]/div[1]/table/tbody/tr[4]/td[2]"));
		dataDeparture.click();
		WebElement searchButton = driver.findElement(By.xpath(".//button[@data-sb-id=\"main\"]"));
		searchButton.click();
		WebElement drobdownAdults = driver.findElement(By.xpath(".//select[@name=\"group_adults\"]"));
		Select selectAdults = new Select(drobdownAdults);
		selectAdults.selectByIndex(3);
		WebElement drobdownRooms = driver.findElement(By.xpath(".//select[@name=\"no_rooms\"]"));
		Select selectRooms = new Select(drobdownRooms);
		selectRooms.selectByIndex(1);
		searchButton = driver.findElement(By.xpath("//*[@id=\"frm\"]/div[5]/div[2]/button"));
		searchButton.click();
		WebElement maxPrice = driver.findElement(By.xpath("//*[@id=\"filter_price\"]/div[2]/a[5]/div"));
		maxPrice.click();
		WebElement cheap = driver.findElement(By.xpath("//*[@id=\"sort_by\"]/ul/li[2]/a"));
		cheap.click();
		Thread.sleep(2000);
		WebElement hotel = driver
				.findElement(By.xpath("(.//*[@class=\" sr_item_photo_link sr_hotel_preview_track  \"])[1]"));
		hotel.click();
		Set<String> windows = driver.getWindowHandles();
		for (String winHandle : windows) {
			driver.switchTo().window(winHandle);
		}
		Thread.sleep(2000);
		WebElement booking = driver.findElement(By.xpath("//*[@id=\"hp_book_now_button\"]"));
		booking.click();
		WebElement drobdownRoom = driver
				.findElement(By.xpath("//*[@id=\"hprt-form\"]/table/tbody/tr[1]/td[5]/div/label/select"));
		Select selectRoom = new Select(drobdownRoom);
		selectRoom.selectByIndex(1);
		booking = driver.findElement(By.xpath("//*[@class=\"hprt-reservation-cta\"]"));
		booking.click();
		WebElement future = driver.findElement(By.xpath("//*[@data-tooltip-class=\"submit_holder_button_tooltip\"]"));
		future.click();
		Thread.sleep(1000);
		WebElement phone = driver.findElement(By.xpath("//*[@id=\"phone\"]"));
		phone.clear();
		phone.sendKeys("80291111111");
		WebElement karta = driver.findElement(By.xpath("//*[@id=\"cc_type\"]"));
		Select selectKarta = new Select(karta);
		selectKarta.selectByIndex(2);
		WebElement numberKarta = driver.findElement(By.xpath("//*[@id=\"cc_number\"]"));
		numberKarta.clear();
		numberKarta.sendKeys("4111111111111111");
		WebElement month = driver.findElement(By.xpath("//*[@id=\"cc_month\"]"));
		Select selectMonth = new Select(month);
		selectMonth.selectByIndex(7);
		WebElement year = driver.findElement(By.xpath("//*[@id=\"ccYear\"]"));
		Select selectYear = new Select(year);
		selectYear.selectByIndex(4);
		WebElement cvc = driver.findElement(By.xpath("//*[@id=\"cc_cvc\"]"));
		cvc.clear();
		cvc.sendKeys("347");
		WebElement endBooking = driver.findElement(By.xpath("(//*[@class=\"submit_holder_button_text_wrap\"])[2]"));
		endBooking.click();
		Thread.sleep(20000);
		List<WebElement> newKarta = driver.findElements(By.xpath("//*[@id=\"js--pay-form__error__anchor_all\"]"));
		System.out.println(newKarta.size() != 0);

	}

}
