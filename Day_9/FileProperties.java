package Day_9;
/*
Q6. Check if a File Exists and Display Properties
Create a program to check if report.txt exists. If it does, display its properties.
*/
import java.io.*;

public class FileProperties {
    public static void main(String[] args) {
        File f = new File("student.txt");
        if(f.exists()) {
            System.out.println("Absolute path: " + f.getAbsolutePath());
            System.out.println("File name: " + f.getName());
            System.out.println("Writable: " + f.canWrite());
            System.out.println("Readable: " + f.canRead());
            System.out.println("File size in bytes: " + f.length());
        } else {
            System.out.println("File does not exist.");
        }
    }
}
