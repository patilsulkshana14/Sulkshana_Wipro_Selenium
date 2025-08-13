package Day_9;
/*
Q14. Replace a Word in a File
Read content from story.txt, replace all occurrences of the word "Java" with "Python", and write the updated content to updated_story.txt.
*/
import java.io.*;

public class ReplaceWordInFile {
    public static void main(String[] args) throws Exception {
        // create file story.txt with sample data
        FileWriter fw = new FileWriter("notes.txt");
        fw.write("Java is a language\nI love Java programming");
        fw.close();
        
        BufferedReader br = new BufferedReader(new FileReader("notes.txt"));
        String line;
        StringBuilder sb = new StringBuilder();
        while((line = br.readLine()) != null) {
            sb.append(line.replace("Java", "Python")).append("\n");
        }
        br.close();
        
        FileWriter fw2 = new FileWriter("updated_notes.txt");
        fw2.write(sb.toString());
        fw2.close();
        
        System.out.println("Word replaced successfully.");
    }
}
