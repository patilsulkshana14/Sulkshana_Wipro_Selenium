package Day_11;

/*
Q4. Develop a program to search a student by ID using JDBC.
*/

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class SearchStudentByID {
    public static void main(String[] args) {
        int searchId = 102;
        String url = "jdbc:mysql://localhost:3306/mydb";
        String user = "root";
        String password = "Sulkshana14@";

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection(url, user, password);
            Statement stmt = con.createStatement();

            ResultSet rs = stmt.executeQuery("SELECT * FROM students WHERE rollno=" + searchId);

            if (rs.next()) {
                System.out.println("Student Found:");
                System.out.println("RollNo: " + rs.getInt("rollno"));
                System.out.println("Name: " + rs.getString("name"));
                System.out.println("Percentage: " + rs.getFloat("per"));
                System.out.println("Email: " + rs.getString("email"));
                System.out.println("City: " + rs.getString("city"));
            } else {
                System.out.println("Student not found with ID: " + searchId);
            }

            stmt.close();
            con.close();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
