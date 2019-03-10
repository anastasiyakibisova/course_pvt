package pvt;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.After;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class RatingSteps {

	private WebDriver driver;
	private RatingCheck ratingCheck;

	public RatingSteps() {
		driver = new ChromeDriver();
		ratingCheck = new RatingCheck(driver);
	}

	@Given("^I am on page with \"([^\"]*)\" url$")
	public void loadPageWithUrl(String url) {
		driver.get(url);
	}

	@When("^I enter the \"([^\"]*)\" city$")
	public void inputCity(String city) {
		ratingCheck.inputSearchField(city);
	}

	@When("^I see the date selection window$")
	public void inputDate() {
		ratingCheck.dataClick();
		ratingCheck.dataArivalClick();
		ratingCheck.dataDepartureClick();
	}

	@When("^I press the search button$")
	public void searchButton() {
		ratingCheck.searchButtonClick();
	}

	@When("^I choose a rating$")
	public void maxRating() {
		ratingCheck.maxRatingClick();
	}

	@When("^I open the page with the first hotel$")
	public void openHotel() {
		ratingCheck.hotelClick(driver);
	}

	@Then("I see hotels")
	public void seeHotels() {
		Assert.assertTrue(ratingCheck.hotelCheck());
	}

	@Then("I check the rating")
	public void checkRating() {
		Assert.assertTrue(ratingCheck.getRating());
	}

	@After
	public void afterClass() {
		driver.quit();
	}
}
