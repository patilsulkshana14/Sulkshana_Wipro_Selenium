package Day_9;
/*
Q11. Create a program where:
Student implements Comparable to sort by name
Use Comparator to sort by marks
Demonstrate both sorting techniques in the same program.
*/
import java.util.*;

class StudentComparable implements Comparable<StudentComparable> {
	int id;
	String name;
	int marks;
	StudentComparable(int id,String name,int marks){
		this.id=id;
		this.name=name;
		this.marks=marks;
	}
	public int compareTo(StudentComparable o) {
		return this.name.compareTo(o.name);
	}
	public String toString() {
		return id+" "+name+" "+marks;
	}
}

public class StudentSortBoth {
	public static void main(String args[]) {
		List<StudentComparable> list=Arrays.asList(
				new StudentComparable(1,"Ravi",78),
				new StudentComparable(2,"Amit",85),
				new StudentComparable(3,"Neha",92)
				);
		Collections.sort(list);
		Collections.sort(list,(s1,s2)->s2.marks - s1.marks);
		for(StudentComparable s:list) {
			System.out.println(s);
		}
	}
}
