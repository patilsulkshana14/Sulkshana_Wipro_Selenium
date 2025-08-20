package Hospital;
import java.sql.*;
public class Hospital_p {

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
		            stmt.executeUpdate("CREATE TABLE patients(patient_id INT PRIMARY KEY,name VARCHAR(50),ward_no INT,admission_date DATE)");
		            stmt.executeUpdate("INSERT INTO patients VALUES" +
		                    "(1,'Anita',101,'2025-08-01')," +
		                    "(2,'Rahul',101,'2025-08-01')," +
		                    "(3,'Sita',102,'2025-08-02')," +
		                    "(4,'Amit',103,'2025-08-02')," +
		                    "(5,'Reema',101,'2025-08-03')");

		            stmt.execute("DROP PROCEDURE IF EXISTS avg_patient_count_daily");
		            stmt.execute("DROP PROCEDURE IF EXISTS patients_same_ward");
		            stmt.execute("DROP PROCEDURE IF EXISTS patients_by_admission");

		            stmt.execute("CREATE PROCEDURE avg_patient_count_daily() BEGIN " +
		                    "SELECT AVG(patient_count) AS avg_patient_per_day FROM (" +
		                    "SELECT admission_date, COUNT(*) AS patient_count FROM patients GROUP BY admission_date" +
		                    ") AS daily_counts; END");

		            stmt.execute("CREATE PROCEDURE patients_same_ward() BEGIN " +
		                    "SELECT * FROM patients WHERE ward_no IN (" +
		                    "SELECT ward_no FROM patients GROUP BY ward_no HAVING COUNT(*)>1); END");

		            stmt.execute("CREATE PROCEDURE patients_by_admission() BEGIN " +
		                    "SELECT * FROM patients ORDER BY admission_date; END");

		            System.out.println("Procedures created successfully\n");

		            CallableStatement cs1=con.prepareCall("{call avg_patient_count_daily()}");
		            ResultSet rs1=cs1.executeQuery();
		            while(rs1.next()) {
		                System.out.println("Average patients per day: " + rs1.getDouble("avg_patient_per_day"));
		            }
		            rs1.close(); cs1.close();

		            System.out.println("\nPatients in same ward:");
		            CallableStatement cs2=con.prepareCall("{call patients_same_ward()}");
		            ResultSet rs2=cs2.executeQuery();
		            while(rs2.next()) {
		                System.out.println(rs2.getInt("patient_id")+" - "+rs2.getString("name")+" (Ward: "+rs2.getInt("ward_no")+")");
		            }
		            rs2.close(); cs2.close();

		            System.out.println("\nPatients by admission date:");
		            CallableStatement cs3=con.prepareCall("{call patients_by_admission()}");
		            ResultSet rs3=cs3.executeQuery();
		            while(rs3.next()) {
		                System.out.println(rs3.getInt("patient_id")+" - "+rs3.getString("name")+" (Admitted: "+rs3.getDate("admission_date")+")");
		            }
		            rs3.close(); cs3.close();

		            stmt.close();
		            con.close();
		        }
		        catch(Exception e) {
		            e.printStackTrace();
		        }
		    }


	

}
