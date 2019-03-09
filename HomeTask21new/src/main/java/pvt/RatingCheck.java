package pvt;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class RatingCheck {

    @FindBy(xpath = ".//*[@id=\"ss\"]")
    private WebElement searchField;

    @FindBy(xpath = "(.//*[@class=\"sb-date-field__icon sb-date-field__icon-btn bk-svg-wrapper calendar-restructure-sb\"])[1]")
    private WebElement data;

    @FindBy(xpath = "//*[@id=\"frm\"]/div[1]/div[2]/div[2]/div/div/div[3]/div[1]/table/tbody/tr[4]/td[1]")
    private WebElement dataArival;

    @FindBy(xpath = "//*[@id=\"frm\"]/div[1]/div[2]/div[2]/div/div/div[3]/div[1]/table/tbody/tr[4]/td[6]")
    private WebElement dataDeparture;

    @FindBy(xpath = ".//button[@data-sb-id=\"main\"]")
    private WebElement searchButton;

    @FindBy(xpath = ".//div[@data-et-view=\" eWHJbWPNZWEHXT:5\"]")
    private List<WebElement> hotels;

    @FindBy(xpath = "//*[@id=\"filter_review\"]/div[2]/a[1]/div")
    private WebElement maxRating;

    @FindBy(xpath = "//*[@id=\"hotel_3197969\"]/a")
    private WebElement hotel;

    @FindBy(xpath = ".//div[@role=\"link\"][1]")
    private WebElement rating;

    public RatingCheck(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }

    public void inputSearchField() {
        searchField.clear();
        searchField.sendKeys("Москва");
    }

    public void dataClick() {
        data.click();
    }

    public void dataArivalClick() {
        dataArival.click();
    }

    public void dataDepartureClick() {
        dataDeparture.click();
    }

    public void searchButtonClick() {
        searchButton.click();
    }

    public boolean hotelCheck() {
        return hotels != null;
    }

    public void maxRatingClick() {
        maxRating.click();
    }

    public void hotelClick(WebDriver driver) {
        new WebDriverWait(driver, 5).until(ExpectedConditions.visibilityOf(hotel));
        hotel.click();
    }

    public double getRating() {
        String strRating = rating.getText().replace(',', '.');
        return Double.valueOf(strRating);
    }
}
