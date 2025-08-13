package Day_9;
/*
Q3. Append Data to a File
Write a Java program to append a new student name to the existing student.txt file without overwriting existing data.
*/
import java.io.*;

public class AppendFile {
    public static void main(String[] args) throws Exception {
        FileWriter fw = new FileWriter("student.txt", true);
        fw.write("Neha\n");
        fw.close();
        System.out.println("Data Appended");
    }
}
