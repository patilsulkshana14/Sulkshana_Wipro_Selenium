package Day_9;
/*
Q8. Sort Employee objects by joining date using Comparator.
Use Comparator to sort employees based on LocalDate or Date.
*/
import java.time.LocalDate;
import java.util.*;

class EmployeeJoin {
	int id;
	String name;
	LocalDate joinDate;
	EmployeeJoin(int id,String name,LocalDate joinDate){
		this.id=id;
		this.name=name;
		this.joinDate=joinDate;
	}
	public String toString() {
		return id+" "+name+" "+joinDate;
	}
}

public class Comparator_EmployeeJoinDate {
	public static void main(String args[]) {
		List<EmployeeJoin> list=Arrays.asList(
				new EmployeeJoin(1,"Amit",LocalDate.of(2022,5,10)),
				new EmployeeJoin(2,"Ravi",LocalDate.of(2021,3,15)),
				new EmployeeJoin(3,"Neha",LocalDate.of(2023,1,20))
				);
		Collections.sort(list,(e1,e2)->e1.joinDate.compareTo(e2.joinDate));
		for(EmployeeJoin e:list) {
			System.out.println(e);
		}
	}
}
