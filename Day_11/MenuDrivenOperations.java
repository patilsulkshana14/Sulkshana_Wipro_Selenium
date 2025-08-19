/*
Q15. Implement a Java application to take dynamic input from the user and perform insertion, search, or update using menu-driven logic.
(Note: Here we are using fixed values instead of real input for demonstration.)
*/
package Day_11;

import java.sql.*;

public class MenuDrivenOperations {
    public static void main(String[] args) {
        String url = "jdbc:mysql://localhost:3306/mydb";
        String user = "root";
        String password = "Sulkshana14@";

        int choice = 1; // 1=Insert, 2=Search, 3=Update

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection(url, user, password);
            Statement stmt = con.createStatement();

            if (choice == 1) {
                stmt.executeUpdate("INSERT INTO students VALUES (401,'Rahul',78,'rahul@gmail.com','Pune')");
                System.out.println("Inserted Successfully");
            } else if (choice == 2) {
                ResultSet rs = stmt.executeQuery("SELECT * FROM students WHERE rollno=401");
                while (rs.next()) {
                    System.out.println(rs.getString("name"));
                }
            } else if (choice == 3) {
                stmt.executeUpdate("UPDATE students SET per=80 WHERE rollno=401");
                System.out.println("Updated Successfully");
            }

            stmt.close();
            con.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
