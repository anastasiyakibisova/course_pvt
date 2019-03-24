package pvt.Task25;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class MoveToSpamTest {

	private LoginPage loginPage;
	private WebDriver driver;
	private Users users;

	@Before
	public void setUp() throws Exception {
		String url = "jdbc:mysql://localhost:3306/sys?useSSL=false&serverTimezone=UTC";
		String user = "root";
		String password = "5972863qaz";
		ArrayList<Users> mySQL = new ArrayList<Users>();

		String query = "SELECT * FROM test_mailru.tests";
		try (Connection con = DriverManager.getConnection(url, user, password);
				Statement st = con.createStatement();
				ResultSet rs = st.executeQuery(query)) {
			while (rs.next()) {
				int id = rs.getInt(1);
				String site = rs.getString(2);
				String login = rs.getString(3);
				String pass = rs.getString(4);
				String email = rs.getString(5);
				String theme = rs.getString(6);
				String text = rs.getString(7);
				users = new Users(id, site, login, pass, email, theme, text);
				mySQL.add(users);
			}
			rs.close();
		} catch (SQLException ex) {
			ex.printStackTrace();

		}
		driver = new ChromeDriver();
		loginPage = new LoginPage(driver);
		driver.manage().window().maximize();
	}

	@After
	public void tearDown() throws Exception {
		driver.quit();
	}

	@Test
	public void test() {
		driver.get(users.getSite());
		loginPage.enterData(users.getLogin(), users.getPassword());
		loginPage.clickEnterButton();
		Assert.assertTrue(loginPage.isLogoutLinkDisplayd(driver));
		loginPage.clickItemSelection(driver);
		loginPage.clickSpamButton();
		Assert.assertTrue(loginPage.messageSpamDisplayd(driver));
	}
}
