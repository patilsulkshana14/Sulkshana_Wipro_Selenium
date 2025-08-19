package Day_10;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

//6. Write a program to count the number of lines, words, and characters in a file.
public class Count 
{
	public static void main(String[] args) throws IOException 
	{
		File f=new File("Test.txt");
	
		int charc=0;
		int wordc=0;
		int linec=0;
		
		BufferedReader b;
		try
		{
			b=new BufferedReader(new FileReader(f));
			String currLine=b.readLine();
			
			while(currLine!=null)
			{
				linec ++;
				
				String words[]=currLine.split(" ");
				wordc= wordc+words.length;
				
				for(String i:words )
				{
					charc=charc+i.length();
				}
				currLine=b.readLine();
			}
			System.out.println("Lines: "+linec);
			System.out.println("Words: "+wordc);
			System.out.println("Chars: "+charc);
		}
		catch(FileNotFoundException e)
		{
			e.printStackTrace();
		}
}
}
