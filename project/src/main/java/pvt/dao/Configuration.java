package pvt.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

public class Configuration {
	
	private static Infromation inf;

	public static Infromation infomationSite(int num) throws Exception {
		String url = "jdbc:mysql://localhost:3306/sys?useSSL=false&serverTimezone=UTC";
		String user = "root";
		String password = "5972863qaz";
		ArrayList<Infromation> mySQL = new ArrayList<Infromation>();
		if (num == 1) {
			String query = "SELECT email, theme, text FROM mailmultitool.request;";
			try (Connection con = DriverManager.getConnection(url, user, password);
					Statement st = con.createStatement();
					ResultSet rs = st.executeQuery(query)) {
				while (rs.next()) {
					String email = rs.getString(1);
					String theme = rs.getString(2);
					String text = rs.getString(3);
					inf = new Infromation(email, theme, text);
					mySQL.add(inf);
				}
				rs.close();
			} catch (SQLException ex) {
				ex.printStackTrace();
			}
		} else {
			String query = "SELECT token, number, text1, text2 FROM mailmultitool.token;";
			try (Connection con = DriverManager.getConnection(url, user, password);
					Statement st = con.createStatement();
					ResultSet rs = st.executeQuery(query)) {
				while (rs.next()) {
					String token = rs.getString(1);
					String number = rs.getString(2);
					String text1 = rs.getString(3);
					String text2 = rs.getString(4);
					inf = new Infromation(token, number, text1, text2);
					mySQL.add(inf);
				}
				rs.close();
			} catch (SQLException ex) {
				ex.printStackTrace();
			}
		}
		return inf;
	}
}
