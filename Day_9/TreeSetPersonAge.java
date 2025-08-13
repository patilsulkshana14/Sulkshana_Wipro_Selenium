package Day_9;
/*
Q15. Use TreeSet with a custom comparator to sort a list of persons by age.
*/
import java.util.*;

class PersonAge {
	String name;
	int age;
	PersonAge(String name,int age){
		this.name=name;
		this.age=age;
	}
	public String toString() {
		return name+" "+age;
	}
}

public class TreeSetPersonAge {
	public static void main(String args[]) {
		Set<PersonAge> set=new TreeSet<>((p1,p2)->p1.age - p2.age);
		set.add(new PersonAge("Ravi",30));
		set.add(new PersonAge("Amit",25));
		set.add(new PersonAge("Neha",28));
		for(PersonAge p:set) {
			System.out.println(p);
		}
	}
}
