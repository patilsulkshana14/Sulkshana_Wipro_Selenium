/*
Q14. Create a login system using JDBC where user credentials are verified from the database.
*/
package Day_11;

import java.sql.*;

public class LoginSystem {
    public static void main(String[] args) {
        String url = "jdbc:mysql://localhost:3306/mydb";
        String user = "root";
        String password = "Sulkshana14@";

        String usernameToCheck = "admin";
        String passwordToCheck = "admin123";

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection(url, user, password);

            String sql = "SELECT * FROM users WHERE username=? AND password=?";
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setString(1, usernameToCheck);
            ps.setString(2, passwordToCheck);

            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                System.out.println("Login Successful");
            } else {
                System.out.println("Invalid Credentials");
            }

            ps.close();
            con.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
