package Day_9;
/*
Q7. Create a File and Accept User Input
Accept input from the user (using Scanner) and write the input to a file named userinput.txt.
*/
import java.io.*;
import java.util.*;

public class UserInputFile {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        FileWriter fw = new FileWriter("userinput.txt");
        String data = sc.nextLine();
        fw.write(data);
        fw.close();
        sc.close();
        System.out.println("User input written to file");
    }
}
