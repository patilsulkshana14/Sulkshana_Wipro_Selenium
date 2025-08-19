package Day_10;

import java.io.Serializable;

public class Student implements Serializable
	{
		int rollno;
		String name;
		
		Student(int rollno, String name)
		{
			this.rollno=rollno;
			this.name=name;
		}
		void display() {
			System.out.println("Roll number: "+rollno);
			System.out.println("Name       : "+name);
		}
}
