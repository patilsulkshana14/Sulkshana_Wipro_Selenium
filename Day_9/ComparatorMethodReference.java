package Day_9;
/*
Q14. Use Comparator.comparing() with method references to sort objects in Java 8+.
*/
import java.util.*;

class Person {
	int id;
	String name;
	Person(int id,String name){
		this.id=id;
		this.name=name;
	}
	public String getName() {
		return name;
	}
	public String toString() {
		return id+" "+name;
	}
}

public class ComparatorMethodReference {
	public static void main(String args[]) {
		List<Person> list=Arrays.asList(
				new Person(3,"Ravi"),
				new Person(1,"Amit"),
				new Person(2,"Neha")
				);
		Collections.sort(list,Comparator.comparing(Person::getName));
		for(Person p:list) {
			System.out.println(p);
		}
	}
}
