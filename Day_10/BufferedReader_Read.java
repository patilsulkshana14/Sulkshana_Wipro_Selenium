package Day_10;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

//•	4. Write a program to read the content of a file line by line using BufferedReader.
public class BufferedReader_Read {
	public static void main(String[] args) throws IOException {
		List<String> lines=new ArrayList<String>();
		BufferedReader r=new BufferedReader(new FileReader("Test.txt"));
		String line;
		
		while((line=r.readLine())!=null)
		{
			lines.add(line);
			
		}
		
		for(String l:lines)
		{
			System.out.println(l);
		}
		r.close();

	}
}
