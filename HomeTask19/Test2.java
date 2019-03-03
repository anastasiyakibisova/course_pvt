package core;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Set;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Test2 {
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
		Thread.sleep(2000);
		WebElement cheap = driver.findElement(By.xpath("//*[@id=\"sort_by\"]/ul/li[2]/a"));
		cheap.click();
		Thread.sleep(2000);
		WebElement hotel = driver
				.findElement(By.xpath("(//*[@class=\" sr_item_photo_link sr_hotel_preview_track  \"])[1]"));
		hotel.click();
		Thread.sleep(2000);
		Set<String> windows = driver.getWindowHandles();
		for (String winHandle : windows) {
			driver.switchTo().window(winHandle);
		}
		Thread.sleep(2000);
		WebElement price = driver.findElement(
				By.xpath("//*[@id=\"group_recommendation\"]/table/tbody/tr[1]/td[2]/table/tbody/tr[1]/td/span[2]"));
		String strPrice = price.getText();
		ArrayList<String> list = new ArrayList<>(Arrays.asList(strPrice.split("\\D+")));
		String s = list.get(1) + list.get(2);
		Integer intPrice = Integer.valueOf(s);
		int countNight = 6;
		double priceNight = intPrice / countNight;
		if (priceNight >= 970) {
			System.out.println("the price does not exceed the specified range");
		} else {
			System.out.println("ERROR, price exceeds the specified range");
		}

	}

}
