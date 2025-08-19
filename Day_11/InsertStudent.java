package Day_11;

/*
Q2. Create a Java class to insert student records into a database table.
*/

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class InsertStudent {
    public static void main(String[] args) {
        String url = "jdbc:mysql://localhost:3306/mydb";
        String user = "root";
        String password = "Sulkshana14@";

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection(url, user, password);
            Statement stmt = con.createStatement();

            String createTable = "CREATE TABLE IF NOT EXISTS students(rollno INT, name VARCHAR(50), per FLOAT, email VARCHAR(50), city VARCHAR(50))";
            stmt.executeUpdate(createTable);

            String insertData = "INSERT INTO students VALUES" +
                    "(101, 'Neeva Sharma', 98, 'abc@gmail.com', 'Pune')," +
                    "(102, 'Reeva Sharma', 89, 'reeva@gmail.com', 'Chennai')," +
                    "(103, 'Shiva Upadhyay', 79, 'shiva@gmail.com', 'Mumbai')";
            stmt.executeUpdate(insertData);

            System.out.println("Student records inserted successfully");

            stmt.close();
            con.close();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
