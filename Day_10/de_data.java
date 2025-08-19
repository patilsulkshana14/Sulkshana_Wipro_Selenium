package Day_10;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;


public class de_data {
	public static void main(String[] args) throws IOException, ClassNotFoundException
	{
		FileInputStream fis= new FileInputStream("Student.txt");
		ObjectInputStream ois= new ObjectInputStream(fis);
		
		Student s1 = (Student) ois.readObject();
		
		s1.display();
		ois.close();
		fis.close();
		System.out.println("Derialization done Sucessfull");

	}
}
