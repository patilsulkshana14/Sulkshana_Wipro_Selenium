package Day_10;

import java.io.File;
//2. Write a program to check whether a file exists at a given path
public class Existing_file {
	public static void main(String[] args) {
		File f=new File("Test.txt");
		
		if(f.exists())
		{
			System.out.println("File name    : "+f.getName());
			System.out.println("File Location: "+f.getAbsolutePath());
		}
		else
		{
			System.out.println("File not found");
		}
		
	}
}
