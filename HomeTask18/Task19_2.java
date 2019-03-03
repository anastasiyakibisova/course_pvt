package core;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task19_2 {

	public static void main(String[] args) throws InterruptedException {
		String exePath = "D:\\install\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", exePath);
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.booking.com");
		WebElement searchField = driver.findElement(By.xpath(".//*[@id=\"ss\"]"));
		searchField.clear();
		searchField.sendKeys("Москва");
		WebElement data = driver.findElement(By.xpath(
				"(.//*[@class=\"sb-date-field__icon sb-date-field__icon-btn bk-svg-wrapper calendar-restructure-sb\"])[1]"));
		data.click();
		WebElement dataArival = driver.findElement(
				By.xpath("//*[@id=\"frm\"]/div[1]/div[2]/div[2]/div/div/div[3]/div[1]/table/tbody/tr[4]/td[1]"));
		dataArival.click();
		WebElement dataDeparture = driver.findElement(
				By.xpath("//*[@id=\"frm\"]/div[1]/div[2]/div[2]/div/div/div[3]/div[1]/table/tbody/tr[4]/td[6]"));
		dataDeparture.click();
		WebElement searchButton = driver.findElement(By.xpath(".//button[@data-sb-id=\"main\"]"));
		searchButton.click();
		List<WebElement> hotel = driver.findElements(By.xpath(".//div[@data-et-view=\" eWHJbWPNZWEHXT:5\"]"));
		System.out.println(hotel != null ? "hotels for selected dates" : "no hotels on selected dates");
		driver.close();
		driver.quit();
	}
}
