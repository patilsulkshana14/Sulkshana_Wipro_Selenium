package Day_11;

/*
Create a JDBC-based program to count the total number of rows in a table.
*/

import java.sql.*;

public class CountRows {
    public static void main(String[] args) throws Exception {
        String url="jdbc:mysql://localhost:3306/mydb";
        String user="root";
        String password="Sulkshana14@";

        Class.forName("com.mysql.cj.jdbc.Driver");
        try (Connection con = DriverManager.getConnection(url,user,password);
             Statement stmt = con.createStatement()) {

            stmt.executeUpdate("CREATE TABLE IF NOT EXISTS students (id INT PRIMARY KEY, name VARCHAR(50), percentage DOUBLE)");
            stmt.executeUpdate("REPLACE INTO students VALUES (101,'Anita',82.5),(102,'Bala',74.0),(103,'Chirag',91.0)");

            ResultSet rs = stmt.executeQuery("SELECT COUNT(*) FROM students");
            if (rs.next()) {
                System.out.println("Total rows in students: " + rs.getInt(1));
            }
        }
    }
}
