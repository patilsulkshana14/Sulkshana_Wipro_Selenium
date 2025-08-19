package Day_11;

/*
Q5. Implement an update operation to modify student details in the database using JDBC.
*/

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class UpdateStudent {
    public static void main(String[] args) {
        String url = "jdbc:mysql://localhost:3306/mydb";
        String user = "root";
        String password = "Sulkshana14@";

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection(url, user, password);
            Statement stmt = con.createStatement();

            String updateSQL = "UPDATE students SET email='reeva_updated@gmail.com' WHERE rollno=102";
            int rowsUpdated = stmt.executeUpdate(updateSQL);

            if (rowsUpdated > 0) {
                System.out.println("Student record updated successfully!");
            } else {
                System.out.println("No student found to update.");
            }

            stmt.close();
            con.close();
        } catch (Exception e) {
            System.out.println( e.getMessage());
        }
    }
}
