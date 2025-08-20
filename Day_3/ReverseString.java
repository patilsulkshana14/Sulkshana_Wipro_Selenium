package Day_3_Assignment;

public class ReverseString {

	public static void main(String[] args) {
		
		String ch="ABCD";
		
		String reverse=" ";
		
		for(int i=ch.length()-1; i>=0; i--)
		{
			reverse=reverse+ch.charAt(i);
		}
		System.out.println("Reversed String: " + reverse);
	}

}
