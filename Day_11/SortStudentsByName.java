/*
Q9. Develop a program to sort student data in ascending order by name using SQL in JDBC.
*/
package Day_11;

import java.sql.*;

public class SortStudentsByName {
    public static void main(String[] args) {
        String url = "jdbc:mysql://localhost:3306/mydb";
        String user = "root";
        String password = "Sulkshana14@";

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection(url, user, password);
            Statement stmt = con.createStatement();

            ResultSet rs = stmt.executeQuery("SELECT * FROM students ORDER BY name ASC");

            while (rs.next()) {
                System.out.println(rs.getInt("rollno") + " - " + rs.getString("name"));
            }

            stmt.close();
            con.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
