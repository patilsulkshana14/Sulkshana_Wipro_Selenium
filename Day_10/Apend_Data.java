package Day_10;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.Arrays;

//•	5. Write a program to append a line of text to an existing file.
public class Apend_Data 
{
	public static void main(String[] args) throws IOException
	{

		Path path=Paths.get("Test.txt");
				
		Files.write(path, Arrays.asList("\nWelcome"),StandardOpenOption.APPEND);
		System.out.println("Content appended.");
	}
}
