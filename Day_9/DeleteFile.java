package Day_9;
/*
Q12. Delete a File
Write a program to delete a file (given by file name) if it exists.
*/
import java.io.*;
import java.util.*;

public class DeleteFile {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String filename = sc.nextLine();
        sc.close();
        File f = new File(filename);
        if(f.exists()) {
            if(f.delete()) {
                System.out.println("File deleted successfully.");
            } else {
                System.out.println("Unable to delete file.");
            }
        } else {
            System.out.println("File does not exist.");
        }
    }
}
