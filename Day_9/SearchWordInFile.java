package Day_9;
/*
Q13. Word Search in a File
Ask the user to enter a word and check whether it exists in the file notes.txt.
*/
import java.io.*;
import java.util.*;

public class SearchWordInFile {
    public static void main(String[] args) throws Exception {
        // create file notes.txt with sample data
        FileWriter fw = new FileWriter("notes.txt");
        fw.write("Java is powerful\n");
        fw.write("Python is easy\n");
        fw.close();
        
        Scanner sc = new Scanner(System.in);
        String word = sc.nextLine();
        sc.close();
        
        BufferedReader br = new BufferedReader(new FileReader("notes.txt"));
        String line;
        boolean found = false;
        while((line = br.readLine()) != null) {
            if(line.contains(word)) {
                found = true;
                break;
            }
        }
        br.close();
        
        if(found) {
            System.out.println("Word found in file.");
        } else {
            System.out.println("Word not found in file.");
        }
    }
}
