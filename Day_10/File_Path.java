package Day_10;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;

public class File_Path {
	public static void main(String[] args) throws IOException
	{
		//Create file
		Path path=Paths.get("org1_File.txt");
		Files.createFile(path);
		System.out.println("File Created");
		try (BufferedWriter w=new BufferedWriter(new FileWriter("org1_File.txt")))
		{
			w.write("Red");
			w.close();
			System.out.println("Write file Successfully");
		}
		catch(IOException e)
		{
			e.printStackTrace();
		}
	
		//Copy file
		Path copypath=Paths.get("Copy1_File.txt");
		Files.copy(path, copypath,  StandardCopyOption.REPLACE_EXISTING);
		System.out.println("File Copied");
		
		//Move File
		
		Path mpath=Paths.get("Moved_File");
		Files.move(copypath, mpath, StandardCopyOption.REPLACE_EXISTING);
		System.out.println("File Moved");
		
		//Delete File
		Files.deleteIfExists(path);
		Files.deleteIfExists(mpath);
		System.out.println("File Delected");
	}
}
