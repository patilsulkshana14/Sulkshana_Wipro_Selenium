/*
Q11. Use PreparedStatement to insert multiple student records into the database.
*/
package Day_11;

import java.sql.*;

public class InsertMultipleStudents {
    public static void main(String[] args) {
        String url = "jdbc:mysql://localhost:3306/mydb";
        String user = "root";
        String password = "Sulkshana14@";

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection(url, user, password);

            String sql = "INSERT INTO students (rollno, name, per, email, city) VALUES (?, ?, ?, ?, ?)";
            PreparedStatement ps = con.prepareStatement(sql);

            ps.setInt(1, 201);
            ps.setString(2, "Amit");
            ps.setFloat(3, 85);
            ps.setString(4, "amit@gmail.com");
            ps.setString(5, "Delhi");
            ps.addBatch();

            ps.setInt(1, 202);
            ps.setString(2, "Priya");
            ps.setFloat(3, 92);
            ps.setString(4, "priya@gmail.com");
            ps.setString(5, "Pune");
            ps.addBatch();

            ps.executeBatch();

            System.out.println("Multiple students inserted successfully");

            ps.close();
            con.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
