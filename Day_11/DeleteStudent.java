package Day_11;

/*
Q6. Write a Java program to delete a student record from the database using JDBC.
*/

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class DeleteStudent {
    public static void main(String[] args) {
        int deleteId = 103;
        String url = "jdbc:mysql://localhost:3306/mydb";
        String user = "root";
        String password = "Sulkshana14@";

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection(url, user, password);
            Statement stmt = con.createStatement();

            int rowsDeleted = stmt.executeUpdate("DELETE FROM students WHERE rollno=" + deleteId);

            if (rowsDeleted > 0) {
                System.out.println("Student deleted successfully");
            } else {
                System.out.println("No student found with ID: " + deleteId);
            }

            stmt.close();
            con.close();
        } catch (Exception e) {
            System.out.println( e.getMessage());
        }
    }
}
