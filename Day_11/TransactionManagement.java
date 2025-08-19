/*
Q12. Implement a program using transaction management in JDBC (i.e., commit and rollback).
*/
package Day_11;

import java.sql.*;

public class TransactionManagement {
    public static void main(String[] args) {
        String url = "jdbc:mysql://localhost:3306/mydb";
        String user = "root";
        String password = "Sulkshana14@";

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection(url, user, password);
            con.setAutoCommit(false);

            Statement stmt = con.createStatement();
            stmt.executeUpdate("INSERT INTO students VALUES (301,'Ravi',88,'ravi@gmail.com','Bangalore')");
            stmt.executeUpdate("INSERT INTO students VALUES (302,'Meena',90,'meena@gmail.com','Chennai')");

            con.commit();
            System.out.println("Transaction committed successfully");

            stmt.close();
            con.close();
        } catch (Exception e) {
            e.printStackTrace();
            try {
                Connection con = DriverManager.getConnection(url, user, password);
                con.rollback();
                System.out.println("Transaction rolled back");
            } catch (Exception ex) {
                ex.printStackTrace();
            }
        }
    }
}
