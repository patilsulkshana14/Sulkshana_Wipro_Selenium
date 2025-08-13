package Day_9;
/*
Q5. Copy Contents from One File to Another
Write a program to read from source.txt and write the same content into destination.txt.
*/
import java.io.*;

public class CopyFile {
    public static void main(String[] args) throws Exception {
        FileReader fr = new FileReader("student.txt");
        FileWriter fw = new FileWriter("destination.txt");
        int ch;
        while((ch = fr.read()) != -1) {
            fw.write(ch);
        }
        fr.close();
        fw.close();
        System.out.println("File Copied");
    }
}
