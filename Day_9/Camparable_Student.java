package Day_9; 

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Camparable_Student implements Comparable<Camparable_Student>{
	int id;
	String name;
	double marks;
	
	Camparable_Student(int id,String name, double marks)
	{
		this.id=id;
		this.name=name;
		this.marks=marks;
	}
	public int compareTo(Camparable_Student s)
	{
		return id-s.id;			//to sort by id 
	}
	
	public String toString()
	{
		return id+" "+name+" "+marks;
	}
	public static void main(String[] args) {
		List<Camparable_Student>list=Arrays.asList(
			new Camparable_Student(9,"Amit",53.3),
			new Camparable_Student(0,"Rahul",95.20),
			new Camparable_Student(2,"Kiran",80)
		);
		Collections.sort(list);
		list.forEach(System.out::println);
	}

}
