package Day_11;

/*
Q7 Design a Java application to perform all CRUD (Create, Read, Update, Delete) 
operations on an Employee table using JDBC.
*/

import java.sql.*;

public class EmployeeCRUD {
    public static void main(String[] args) throws Exception {
        String url="jdbc:mysql://localhost:3306/mydb";
        String user="root";
        String password="Sulkshana14@";
        
        Class.forName("com.mysql.cj.jdbc.Driver");
        Connection con = DriverManager.getConnection(url, user, password);
        Statement stmt = con.createStatement();
        
        stmt.executeUpdate("CREATE TABLE IF NOT EXISTS employee (id INT, name VARCHAR(50), salary DOUBLE)");
        stmt.executeUpdate("INSERT INTO employee VALUES (1,'John',50000),(2,'Alice',60000),(3,'Bob',55000)");
        System.out.println("Employees inserted");
        
        ResultSet rs = stmt.executeQuery("SELECT * FROM employee");
        System.out.println("\nAll Employees:");
        while(rs.next()) {
            System.out.println(rs.getInt(1)+" "+rs.getString(2)+" "+rs.getDouble(3));
        }
        
        stmt.executeUpdate("UPDATE employee SET salary=65000 WHERE name='Alice'");
        System.out.println("\nAlice's salary updated");
        
        stmt.executeUpdate("DELETE FROM employee WHERE id=1");
        System.out.println("\nEmployee with ID 1 deleted");
        
        rs = stmt.executeQuery("SELECT * FROM employee");
        System.out.println("\nFinal Employee Table:");
        while(rs.next()) {
            System.out.println(rs.getInt(1)+" "+rs.getString(2)+" "+rs.getDouble(3));
        }
        
        stmt.close();
        con.close();
    }
}
