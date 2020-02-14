package theBankList.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

public class Configuration {

    private static Infromation inf;

    public static Infromation infomationData(int num) throws Exception {
        String url = "jdbc:mysql://localhost:3306/userbanklist?useSSL=false&serverTimezone=UTC";
        String user = "root";
        String password = "5972863qaz";
        ArrayList<Infromation> mySQL = new ArrayList<Infromation>();
        if (num == 1) {
            String query = "SELECT userId, name, surName, accountId, account FROM userbanklist.user, userbanklist.account;;";
            try (Connection con = DriverManager.getConnection(url, user, password);
                 Statement st = con.createStatement();
                 ResultSet rs = st.executeQuery(query)) {
                while (rs.next()) {
                    int userId = rs.getInt(1);
                    String name = rs.getString(2);
                    String surName = rs.getString(3);
                    int accountId = rs.getInt(4);
                    int account = rs.getInt(5);
                    inf = new Infromation(userId, name, surName, accountId, account);
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
