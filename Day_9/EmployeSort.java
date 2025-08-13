package Day_9;
/*
Q3. Create an Employee class and sort by name using Comparable.
Use the compareTo() method to sort alphabetically by employee names
*/
import java.util.*;

public class EmployeSort implements Comparable<EmployeSort> {
	int id;
	String name;
	
	EmployeSort(int id,String name){
		this.id=id;
		this.name=name;
	}
	
	public int compareTo(EmployeSort e) {
		return this.name.compareTo(e.name);
	}
	
	public String toString() {
		return id+" "+name;
	}
	
	public static void main(String args[]) {
		List<EmployeSort> l=Arrays.asList(
				new EmployeSort(9,"Sai"),
				new EmployeSort(2,"Durga"),
				new EmployeSort(6,"Akhil")
				);
		Collections.sort(l);
		for(EmployeSort e:l) {
			System.out.println(e);
		}
	}
}
