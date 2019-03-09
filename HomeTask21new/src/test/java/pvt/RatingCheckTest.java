package pvt;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class RatingCheckTest {

    private WebDriver driver;
    private RatingCheck ratingCheck;

    public RatingCheckTest() {
    }

    @Before
    public void setUp() {
        String exePath = "D:\\install\\chromedriver.exe";
        System.setProperty("webdriver.chrome.driver", exePath);
        driver = new ChromeDriver();
        ratingCheck = new RatingCheck(driver);
        driver.manage().window().maximize();
    }

    @After
    public void tearDown() {
        driver.quit();
    }

    @Test
    public void test() {
        driver.get("https://www.booking.com");
        ratingCheck.inputSearchField();
        ratingCheck.dataClick();
        ratingCheck.dataArivalClick();
        ratingCheck.dataDepartureClick();
        ratingCheck.searchButtonClick();
        if (ratingCheck.hotelCheck()) {
            System.out.println("hotels for selected dates");
            ratingCheck.maxRatingClick();
            ratingCheck.hotelClick(driver);
            System.out.println(ratingCheck.getRating() >= 9 ? "rating >= 9" : "rating < 9");
        } else {
            System.out.println("no hotels on selected dates");
        }
    }
}
