package Day_10;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class se_data {
	public static void main(String[] args) throws IOException {
		Student s1=new Student(101,"Sulkshana Patil");
		
		FileOutputStream fos= new FileOutputStream("Student.txt");
		ObjectOutputStream oos= new ObjectOutputStream(fos);
		
		
		oos.writeObject(s1);
		oos.close();
		fos.close();
		System.out.println("Serialization done Sucessfull");
	}
}
