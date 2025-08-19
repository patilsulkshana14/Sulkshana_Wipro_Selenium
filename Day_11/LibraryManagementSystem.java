/*
Q16. Design the schema for a Library Management System and write JDBC programs for:
- Adding a book
- Viewing all books
- Issuing a book to a member
- Returning a book
*/
package Day_11;

import java.sql.*;

public class LibraryManagementSystem {
    public static void main(String[] args) {
        String url = "jdbc:mysql://localhost:3306/mydb";
        String user = "root";
        String password = "Sulkshana14@";

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection(url, user, password);
            Statement stmt = con.createStatement();

            stmt.executeUpdate("CREATE TABLE IF NOT EXISTS books (id INT PRIMARY KEY, title VARCHAR(100), author VARCHAR(50), issued BOOLEAN)");

            stmt.executeUpdate("INSERT INTO books VALUES (1,'Java Basics','John Doe',false)");
            stmt.executeUpdate("INSERT INTO books VALUES (2,'Python Guide','Jane Smith',false)");
            System.out.println("Books Added");

            System.out.println("\nAll Books:");
            ResultSet rs = stmt.executeQuery("SELECT * FROM books");
            while (rs.next()) {
                System.out.println(rs.getInt("id") + " - " + rs.getString("title") + " - " + rs.getString("author") + " - Issued: " + rs.getBoolean("issued"));
            }

            stmt.executeUpdate("UPDATE books SET issued=true WHERE id=1");
            System.out.println("\nBook with ID 1 Issued");

            stmt.executeUpdate("UPDATE books SET issued=false WHERE id=1");
            System.out.println("Book with ID 1 Returned");

            stmt.close();
            con.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
