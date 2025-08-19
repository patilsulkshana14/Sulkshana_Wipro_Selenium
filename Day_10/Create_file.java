package Day_10;

import java.io.File;

public class Create_file 
{
	//1. Write a program to create a new text file named test.txt.
	public static void main(String[] args) {
		File f=new File("Test.txt");
		try
		{
			f.createNewFile();
			System.out.println(f.getAbsolutePath());
			System.out.println(f.setWritable(true));
		}
		catch(Exception e)
		{
			System.out.println("File not found");
			System.out.println(e);
		}
	}
}
