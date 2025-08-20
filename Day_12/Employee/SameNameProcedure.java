package JDBC_Connections;

import java.sql.*;

public class SameNameProcedure {

    public static void main(String[] args) {
        String url="jdbc:mysql://localhost:3306/mydb";
        String user="root";
        String password="Sulkshana14@";

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con=DriverManager.getConnection(url,user,password);
            System.out.println("Connection created");

            CallableStatement cs=con.prepareCall("{call sameName()}");
            ResultSet rs=cs.executeQuery();

            System.out.println("Eid\tName\t\tSalary");
            while(rs.next()) {
                int id=rs.getInt("eid");
                String name=rs.getString("ename");
                int sal=rs.getInt("sal");
                System.out.println(id+"\t"+name+"\t"+sal);
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

