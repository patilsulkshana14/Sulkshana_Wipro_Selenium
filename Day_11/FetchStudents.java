package Day_11;

/*
Q3. Write a JDBC program to fetch and display all student records from the database.
*/

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class FetchStudents {
    public static void main(String[] args) {
        String url = "jdbc:mysql://localhost:3306/mydb";
        String user = "root";
        String password = "Sulkshana14@";

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection(url, user, password);
            Statement stmt = con.createStatement();

            ResultSet rs = stmt.executeQuery("SELECT * FROM students");

            System.out.println("RollNo\tName\t\tPercentage\tEmail\t\t\tCity");
            while (rs.next()) {
                System.out.println(rs.getInt("rollno") + "\t" +
                        rs.getString("name") + "\t" +
                        rs.getFloat("per") + "\t\t" +
                        rs.getString("email") + "\t" +
                        rs.getString("city"));
            }

            stmt.close();
            con.close();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
