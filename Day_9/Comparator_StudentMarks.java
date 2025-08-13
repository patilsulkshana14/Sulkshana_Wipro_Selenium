package Day_9;
/*
Q6. Sort a list of students by marks (descending) using Comparator.
Create a Comparator class or use a lambda expression to sort by marks.
*/
import java.util.*;

class StudentMarks {
	int id;
	String name;
	int marks;
	StudentMarks(int id,String name,int marks){
		this.id=id;
		this.name=name;
		this.marks=marks;
	}
	public String toString() {
		return id+" "+name+" "+marks;
	}
}

public class Comparator_StudentMarks {
	public static void main(String args[]) {
		List<StudentMarks> list=Arrays.asList(
				new StudentMarks(1,"Amit",78),
				new StudentMarks(2,"Ravi",85),
				new StudentMarks(3,"Neha",92)
				);
		Collections.sort(list,(s1,s2) -> s2.marks - s1.marks);
		for(StudentMarks s:list) {
			System.out.println(s);
		}
	}
}
