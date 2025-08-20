package Day_3_Assignment;

public class swap {

	
	void swapping(int a, int b)
	{
		int temp=a;
		a=b;
		b=temp;
		
		System.out.println("\nAfter swapping A is: "+a);
		System.out.println("After swapping B is: "+b);
	}
	
	public static void main(String[] args) 
	{
		swap s=new swap();
		
		int a=10, b=20;
		
		System.out.println("Before swapping A is: "+a);
		System.out.println("Before swapping B is: "+b);
		s.swapping(a,b);
		

	}

}
