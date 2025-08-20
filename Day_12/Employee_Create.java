package JDBC_Connections;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class Employee_Create {

	public static void main(String[] args) {
	        String url="jdbc:mysql://localhost:3306/mydb";
	        String user="root";
	        String password="Sulkshana14@";

	        try {
	            Class.forName("com.mysql.cj.jdbc.Driver");
	            Connection con=DriverManager.getConnection(url,user,password);
	            System.out.println("Connection created");

	            Statement stmt=con.createStatement();

	           
	            stmt.executeUpdate("DROP TABLE IF EXISTS employee");

	            
	            String createTable="CREATE TABLE employee(" +
	                    "eid INT PRIMARY KEY," +
	                    "ename VARCHAR(50)," +
	                    "sal INT)";
	            stmt.executeUpdate(createTable);
	            System.out.println("Employee table created");

	            
	            String insertSQL="INSERT INTO employee VALUES" +
	                    "(101,'Neeva sharma',50000)," +
	                    "(102,'Reeva Varma',55000)," +
	                    "(103,'Shiva Upadhyay',45000)," +
	                    "(104,'Mittal shah',55000)," +
	                    "(105,'Reeva varma',35000)";
	            stmt.executeUpdate(insertSQL);
	            System.out.println("Sample records inserted");

	        }
	        catch(Exception e) {
	            System.out.println(e);
	        }
	    }

}


