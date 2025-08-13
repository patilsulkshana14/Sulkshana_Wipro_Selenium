package Day_9;
/*
Q4. Count Words and Lines
Write a program to count the number of words and lines in a given text file notes.txt.
*/
import java.io.*;

public class CountWordsLines {
    public static void main(String[] args) throws Exception {
        // create file and write sample data
        FileWriter fw = new FileWriter("notes.txt");
        fw.write("Java is fun\n");
        fw.write("File handling in Java\n");
        fw.write("Count words and lines example\n");
        fw.close();
        
        // now read and count
        BufferedReader br = new BufferedReader(new FileReader("notes.txt"));
        String line;
        int lines = 0, words = 0;
        while((line = br.readLine()) != null) {
            lines++;
            String[] arr = line.trim().split("\\s+");
            if(!line.trim().isEmpty()) {
                words += arr.length;
            }
        }
        br.close();
        System.out.println("Lines: " + lines);
        System.out.println("Words: " + words);
    }
}
