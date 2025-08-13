package Day_9;
/*
Q1. Create and Write to a File
Write a Java program to create a file named student.txt and write 5 lines of student names using FileWriter.
*/
import java.io.*;

public class CreateFile {
    public static void main(String[] args) throws Exception {
        FileWriter fw = new FileWriter("student.txt");
        fw.write("Sulkshana\n");
        fw.write("Anisha\n");
        fw.write("Manisha\n");
        fw.write("Anita\n");
        fw.write("Shrushti\n");
        fw.close();
        System.out.println("Data Written");
    }
}
