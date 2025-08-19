package Day_10;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Scanner_Token_Reader {

	   public static void main(String[] args) {
	       File file = new File("Test.txt");

	        try {
	            Scanner sc = new Scanner(file);
	            System.out.println("Tokens in the file:");

	            while (sc.hasNext()) {
	                String token = sc.next();
	                System.out.println(token);
	            }

	            sc.close();
        } 
	       catch (FileNotFoundException e) {
	            System.out.println("File not found.");
	            e.printStackTrace();
        }
    }
}

