package JDBC_Connections;

import java.sql.*;

public class SalaryRangeProcedure {

    public static void main(String[] args) {
        String url="jdbc:mysql://localhost:3306/mydbsel";
        String user="root";
        String password="Sulkshana14@";

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con=DriverManager.getConnection(url,user,password);
            System.out.println("Connection created");

            CallableStatement cs=con.prepareCall("{call highestLow()}");
            ResultSet rs=cs.executeQuery();

            System.out.println("Highest\tLowest");
            while(rs.next()) {
                int high=rs.getInt("highestsal");
                int low=rs.getInt("lowestsal");
                System.out.println(high+"\t"+low);
            }

            rs.close();
            cs.close();
            con.close();
        }
        catch(Exception e) {
            System.out.println(e);
        }
    }
}

