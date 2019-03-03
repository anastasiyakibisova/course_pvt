package core;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Set;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test1 {

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
		// driver.manage().window().maximize();
		driver.get("https://www.booking.com");
		WebElement searchField = driver.findElement(By.xpath(".//*[@id=\"ss\"]"));
		searchField.clear();
		searchField.sendKeys("Париж");
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
		WebElement cheap = driver.findElement(By.xpath("//*[@id=\"sort_by\"]/ul/li[2]/a"));
		cheap.click();
		Thread.sleep(1000);
		List<WebElement> hotels = driver.findElements(By.xpath(".//div[@data-et-view=\" eWHJbWPNZWEHXT:5\"]"));
		if (hotels != null) {
			WebElement maxRating = driver.findElement(By.xpath("//*[@id=\"filter_review\"]/div[2]/a[1]/div"));
			maxRating.click();
			WebElement range = driver
					.findElement(By.xpath("(.//div[@class=\"bui-checkbox__label filter_item css-checkbox\"])[3]"));
			range.click();
			Thread.sleep(1000);
			List<WebElement> rating = driver.findElements(By.xpath(".//*[@class=\"bui-review-score__badge\"]"));
			Double[] masRating = new Double[rating.size()];
			for (int i = 0; i < rating.size(); i++) {
				String strRating = rating.get(i).getText().replace(',', '.');
				Double doubRaiting = Double.valueOf(strRating);
				masRating[i] = doubRaiting;
			}
			int num = 0;
			double max = masRating[num];
			for (int i = 0; i < masRating.length; i++) {
				if (masRating[i] > max) {
					max = masRating[i];
					num = i;
				}
			}
			int number = num + 1;
			String str = "(//*[@class=\" sr_item_photo_link sr_hotel_preview_track  \"])[" + number + "]";
			WebElement hotel = driver.findElement(By.xpath(str));
			hotel.click();
			Thread.sleep(1000);
			Set<String> windows = driver.getWindowHandles();
			for (String winHandle : windows) {
				driver.switchTo().window(winHandle);
			}
			Thread.sleep(2000);
			WebElement apartament = driver
					.findElement(By.xpath("//*[@id=\"hprt-form\"]/table/tbody/tr[1]/td[1]/div/div[1]/a[2]/span[2]"));
			apartament.click();
			WebElement price = driver.findElement(By.xpath("//*[@id=\"blocktoggleRD407074702\"]/div[4]/div[2]/strong"));
			String strPrice = price.getText();
			ArrayList<String> list = new ArrayList<>(Arrays.asList(strPrice.split("\\D+")));
			String s = list.get(1) + list.get(2);
			Integer intPrice = Integer.valueOf(s);
			Integer countNight = Integer.valueOf(list.get(3));
			double priceNight = intPrice / countNight;
			if (priceNight >= 240 && priceNight <= 360) {
				System.out.println("the price does not exceed the specified range");
			} else {
				System.out.println("ERROR, price exceeds the specified range");
			}
		} else {
			System.out.println("no hotels on selected dates");
		}

	}

}
