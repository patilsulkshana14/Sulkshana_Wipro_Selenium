/*
Q18. Write a JDBC-based report generator that exports data from a MySQL table to a text or CSV file.
*/
package Day_11;

import java.sql.*;
import java.io.*;

public class ReportGenerator {
    public static void main(String[] args) {
        String url = "jdbc:mysql://localhost:3306/mydb";
        String user = "root";
        String password = "Sulkshana14@";

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection(url, user, password);

            Statement stmt = con.createStatement();
            ResultSet rs = stmt.executeQuery("SELECT * FROM students");

            BufferedWriter writer = new BufferedWriter(new FileWriter("students_report.csv"));
            writer.write("RollNo,Name,Percentage,Email,City");
            writer.newLine();

            while (rs.next()) {
                writer.write(rs.getInt("rollno") + "," +
                             rs.getString("name") + "," +
                             rs.getFloat("per") + "," +
                             rs.getString("email") + "," +
                             rs.getString("city"));
                writer.newLine();
            }

            writer.close();
            System.out.println("Report generated: students_report.csv");

            stmt.close();
            con.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
