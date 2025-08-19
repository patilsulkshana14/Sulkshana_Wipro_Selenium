package Day_10;

import java.io.File;
import java.io.IOException;

//8. Write a program that lists all the files in a directory.
public class List_Files 
{
	public static void main(String[] args) throws IOException {

	File file=new File("C:\\");
	String files[]=file.list();
	for(String s:files)
	{
		System.out.println(s);
	}
}
}
