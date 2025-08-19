package Day_10;

import java.io.FileWriter;
import java.io.IOException;

public class FileWriter_HelloWorld {
	public static void main(String[] args) {
        try {
            FileWriter writer = new FileWriter("Test.txt");

            writer.write("Hello, World!");

            writer.close();

            System.out.println("Successfully wrote to the file.");
        } 
        catch (IOException e) {
            System.out.println("An error occurred while writing to the file.");
            e.printStackTrace();
        }
    }
}
