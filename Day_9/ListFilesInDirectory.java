package Day_9;
/*
Q11. Print All Files in a Directory
Write a program to list all files (not directories) inside a folder path given by the user.
*/
import java.io.*;
import java.util.*;

public class ListFilesInDirectory {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String path = sc.nextLine();
        sc.close();
        File folder = new File(path);
        if(folder.exists() && folder.isDirectory()) {
            File[] files = folder.listFiles();
            for(File f : files) {
                if(f.isFile()) {
                    System.out.println(f.getName());
                }
            }
        } else {
            System.out.println("Invalid directory.");
        }
    }
}
