package Day_3_Assignment;

public class Addition 
{

	static int a=10;	//Static Variable
	static int b=20;
	
	int c; 						//Instant Variables
	int d;

	void variablesAddition()
	{
		int e=50;			//Local Variable
		int f=50;
		System.out.println("Static Variables Addition: "+(a+b));
		System.out.println("Instant Variables Addition: "+(c+d));
		System.out.println("Local Variables Addition: "+(e+f));
		
		System.out.println(" Variables Addition: "+(a+c+e));
	}
	public static void main(String[] args) 
	{
		Addition add= new Addition();
		
		add.c=30;
		add.d=40;
		
		add.variablesAddition();

	}
}
