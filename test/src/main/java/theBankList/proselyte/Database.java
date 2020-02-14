package theBankList.proselyte;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.*;

public class Database extends HttpServlet{

        static final String JDBC_DRIVER = "org.mysql.Driver";
        static final String DATABASE_URL = "jdbc:mysql://localhost:3306/userbanklist?useSSL=false&serverTimezone=UTC";
        static final String DATABASE_USER = "root";
        static final String DATABASE_PASSWORD = "5972863qaz";
        static final String GET_ALL_DEVELOPERS_RECORDS = "SELECT * FROM developers";

        public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
            response.setContentType("text/html");
            PrintWriter writer = response.getWriter();

            String title = "Database Demo";
            String docType = "<!DOCTYPE html>";

            try {
                Class.forName(JDBC_DRIVER);
                Connection connection = DriverManager.getConnection(DATABASE_URL, DATABASE_USER, DATABASE_PASSWORD);

                Statement statement = connection.createStatement();

                ResultSet resultSet = statement.executeQuery(GET_ALL_DEVELOPERS_RECORDS);

                writer.println(docType + "<html><head><title>" + title + "</title></head><body>");
                writer.println("<h1>DEVELOPERS DATA</h1>");
                writer.println("<br/>");
                while (resultSet.next()) {
                    int userid = resultSet.getInt(1);
                    String name = resultSet.getString(2);
                    String surName = resultSet.getString(3);
                    int accountId = resultSet.getInt(4);
                    int account = resultSet.getInt(5);


                    writer.println("userid: " + userid);
                    writer.println("name: " + name + "<br/>");
                    writer.println("surname: " + surName + "<br/>");
                    writer.println("accountId: " + accountId + "<br/>");
                    writer.println("account: $" + account + "<br/>");
                }

                resultSet.close();
                statement.close();
                connection.close();
            } catch (ClassNotFoundException e) {
                e.printStackTrace();
            } catch (SQLException e) {
                e.printStackTrace();
            }
            writer.println("</body></html>");
        }

        public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
            doGet(request, response);
        }
    }
}
