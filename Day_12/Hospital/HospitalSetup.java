package Hospital;
import java.sql.*;

public class HospitalSetup {

    public static void main(String[] args) {
        String url="jdbc:mysql://localhost:3306/mydb";
        String user="root";
        String password="Sulkshana14@";

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con=DriverManager.getConnection(url,user,password);
            System.out.println("Connected to DB...");

            Statement stmt=con.createStatement();

            stmt.executeUpdate("DROP TABLE IF EXISTS patients");
            String createTable="CREATE TABLE patients(" +
                    "patient_id INT PRIMARY KEY," +
                    "name VARCHAR(50)," +
                    "ward_no INT," +
                    "admission_date DATE)";
            stmt.executeUpdate(createTable);
            System.out.println("Patients table created");

            String insertSQL="INSERT INTO patients VALUES" +
                    "(1,'Anita',101,'2025-08-01')," +
                    "(2,'Rahul',101,'2025-08-01')," +
                    "(3,'Sita',102,'2025-08-02')," +
                    "(4,'Amit',103,'2025-08-02')," +
                    "(5,'Reema',101,'2025-08-03')";
            stmt.executeUpdate(insertSQL);
            System.out.println("Sample patients inserted");

            stmt.execute("DROP PROCEDURE IF EXISTS avg_patient_count_daily");
            stmt.execute("DROP PROCEDURE IF EXISTS patients_same_ward");
            stmt.execute("DROP PROCEDURE IF EXISTS patients_by_admission");

            String proc1="CREATE PROCEDURE avg_patient_count_daily() " +
                    "BEGIN " +
                    "SELECT AVG(patient_count) AS avg_patient_per_day " +
                    "FROM (SELECT admission_date, COUNT(*) AS patient_count " +
                    "FROM patients GROUP BY admission_date) AS daily_counts; " +
                    "END";
            stmt.execute(proc1);

            String proc2="CREATE PROCEDURE patients_same_ward() " +
                    "BEGIN " +
                    "SELECT * FROM patients " +
                    "WHERE ward_no IN (SELECT ward_no FROM patients GROUP BY ward_no HAVING COUNT(*)>1); " +
                    "END";
            stmt.execute(proc2);

            String proc3="CREATE PROCEDURE patients_by_admission() " +
                    "BEGIN " +
                    "SELECT * FROM patients ORDER BY admission_date; " +
                    "END";
            stmt.execute(proc3);

            stmt.close();
            con.close();
            System.out.println("Procedures created successfully");
        }
        catch(Exception e) {
            e.printStackTrace();
        }
    }
}
