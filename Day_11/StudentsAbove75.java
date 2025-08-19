/*
Q10. Write a program to display all students whose percentage is greater than 75 using JDBC and SQL WHERE clause.
*/
package Day_11;

import java.sql.*;

public class StudentsAbove75 {
    public static void main(String[] args) {
        String url = "jdbc:mysql://localhost:3306/mydb";
        String user = "root";
        String password = "Sulkshana14@";

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection(url, user, password);
            Statement stmt = con.createStatement();

            ResultSet rs = stmt.executeQuery("SELECT * FROM students WHERE per > 75");

            while (rs.next()) {
                System.out.println(rs.getInt("rollno") + " - " + rs.getString("name") + " - " + rs.getInt("per"));
            }

            stmt.close();
            con.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
