package Day_10;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;

//7.Write a program to copy content from one file to another using FileReader and FileWriter.
public class Copy_one_file_to_another {

	public static void main(String[] args) throws IOException {
		Path path=Paths.get("Test.txt");
		Path copypath=Paths.get("Copy1_File.txt");
		Files.copy(path, copypath,  StandardCopyOption.REPLACE_EXISTING);
		System.out.println("File Copied");
	}

}
