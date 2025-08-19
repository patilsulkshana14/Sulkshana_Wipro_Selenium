/*
Q17. Create a Hospital Management System database. Using JDBC, implement:
- Register new patient
- Assign doctor
- Generate billing
*/
package Day_11;

import java.sql.*;

public class HospitalManagementSystem {
    public static void main(String[] args) {
        String url = "jdbc:mysql://localhost:3306/mydb";
        String user = "root";
        String password = "Sulkshana14@";

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection(url, user, password);
            Statement stmt = con.createStatement();

            stmt.executeUpdate("CREATE TABLE IF NOT EXISTS patients (id INT PRIMARY KEY, name VARCHAR(50), doctor VARCHAR(50), bill FLOAT)");

            stmt.executeUpdate("INSERT INTO patients VALUES (1,'Anita','Dr. Mehta',5000)");
            System.out.println("Patient Registered");

            stmt.executeUpdate("UPDATE patients SET doctor='Dr. Sharma' WHERE id=1");
            System.out.println("Doctor Assigned");

            ResultSet rs = stmt.executeQuery("SELECT name, bill FROM patients WHERE id=1");
            if (rs.next()) {
                System.out.println("Bill for " + rs.getString("name") + ": " + rs.getFloat("bill"));
            }

            stmt.close();
            con.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
