/*
Q13. Write a JDBC program to handle exceptions (like invalid ID, connection errors) gracefully.
*/
package Day_11;

import java.sql.*;

public class HandleJDBCExceptions {
    public static void main(String[] args) {
        String url = "jdbc:mysql://localhost:3306/mydb";
        String user = "root";
        String password = "Sulkshana14@";

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection(url, user, password);

            Statement stmt = con.createStatement();
            ResultSet rs = stmt.executeQuery("SELECT * FROM students WHERE rollno = 9999");

            if (!rs.next()) {
                System.out.println("No student found with given ID");
            }

            stmt.close();
            con.close();
        } catch (ClassNotFoundException e) {
            System.out.println("MySQL JDBC Driver not found");
        } catch (SQLException e) {
            System.out.println("Database error: " + e.getMessage());
        }
    }
}
