package Day_11;

/*
Q1. Write a Java program to connect to a MySQL database using JDBC.
*/

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectDB {
    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        String url = "jdbc:mysql://localhost:3306/mydb";
        String user = "root";
        String password = "Sulkshana14@";

            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection(url, user, password);
            System.out.println("Connection created successfully");
            con.close();
        
    }
}
