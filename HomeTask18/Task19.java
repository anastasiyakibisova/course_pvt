package core;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task19 {

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
		WebElement maxRating = driver.findElement(By.xpath("//*[@id=\"filter_review\"]/div[2]/a[1]/div"));
		maxRating.click();
		Thread.sleep(5000);
		WebElement hotel = driver.findElement(By.xpath("//*[@id=\"hotel_3197969\"]/a"));
		hotel.click();
		WebElement rating = driver.findElement(By.xpath(".//div[@role=\"link\"][1]"));
		String strRating = rating.getText().replace(',', '.');
		Double doubRaiting = Double.valueOf(strRating);
		if (doubRaiting >= 9) {
			System.out.println("rating >= 9");
		} else {
			System.out.println("rating < 9");
		}
		driver.close();
		driver.quit();

	}

}
