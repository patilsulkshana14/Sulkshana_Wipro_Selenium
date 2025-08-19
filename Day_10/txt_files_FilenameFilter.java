package Day_10;

import java.io.File;
import java.io.FilenameFilter;
//8. Write a program to filter and display only .txt files from a folder using FilenameFilter.
public class txt_files_FilenameFilter {

	public static void main(String[] args) {
		File f = new File("C:\\Users\\admin\\OneDrive\\Desktop\\Wipro");
		
		FilenameFilter txtf = new FilenameFilter() {
            public boolean accept(File dir, String name) {
                return name.toLowerCase().endsWith(".txt");
            }
        };
		String[] txtFiles = f.list(txtf);

        for (String fileName : txtFiles) {
            System.out.println(fileName);
        }

	}

}
