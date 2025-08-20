package Day_3_Assignment;

public class Variable 
{
	static String empname="ABCD";	//Static Variable
	
	int id; 						//Instant Variables
	int age;

	void ShowDetails()
	{
		int salary=50000;			//Local Variable
		System.out.println("Employee Name: "+empname);
		System.out.println("Employee Id  : "+id);
		System.out.println("Employee Age : "+age);
		System.out.println("Employee salary: "+salary);
	}
	public static void main(String[] args) 
	{
		Variable emp= new Variable();
		
		emp.id=121;
		emp.age=25;
		
		emp.ShowDetails();

	}

}
