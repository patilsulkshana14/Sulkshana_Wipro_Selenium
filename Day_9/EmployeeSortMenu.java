package Day_9;
/*
Q13. Write a menu-driven program to sort Employee objects by name, salary, or department using Comparator.
*/
import java.util.*;

class EmployeeMenu {
	int id;
	String name;
	double salary;
	String department;
	EmployeeMenu(int id,String name,double salary,String department){
		this.id=id;
		this.name=name;
		this.salary=salary;
		this.department=department;
	}
	public String toString() {
		return id+" "+name+" "+salary+" "+department;
	}
}

public class EmployeeSortMenu {
	public static void main(String args[]) {
		List<EmployeeMenu> list=Arrays.asList(
				new EmployeeMenu(1,"Ravi",50000,"IT"),
				new EmployeeMenu(2,"Amit",60000,"HR"),
				new EmployeeMenu(3,"Neha",55000,"Finance")
				);
		Scanner sc=new Scanner(System.in);
		int choice=sc.nextInt();
		if(choice==1) Collections.sort(list,(e1,e2)->e1.name.compareTo(e2.name));
		else if(choice==2) Collections.sort(list,(e1,e2)->Double.compare(e1.salary,e2.salary));
		else if(choice==3) Collections.sort(list,(e1,e2)->e1.department.compareTo(e2.department));
		for(EmployeeMenu e:list) {
			System.out.println(e);
		}
	}
}
