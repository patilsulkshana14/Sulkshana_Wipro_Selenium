package Day_9;
/*
Q8. Reverse File Content
Write a program to read a file data.txt and create another file reversed.txt containing the lines in reverse order.
*/
import java.io.*;
import java.util.*;

public class ReverseFileContent {
    public static void main(String[] args) throws Exception {
        // create file data.txt
        FileWriter fw = new FileWriter("data.txt");
        fw.write("First line\n");
        fw.write("Second line\n");
        fw.write("Third line\n");
        fw.close();
        
        // read file into list
        BufferedReader br = new BufferedReader(new FileReader("data.txt"));
        List<String> lines = new ArrayList<>();
        String line;
        while((line = br.readLine()) != null) {
            lines.add(line);
        }
        br.close();
        
        // reverse and write to reversed.txt
        Collections.reverse(lines);
        FileWriter fw2 = new FileWriter("reversed.txt");
        for(String l : lines) {
            fw2.write(l + "\n");
        }
        fw2.close();
        
        System.out.println("File reversed successfully.");
    }
}
