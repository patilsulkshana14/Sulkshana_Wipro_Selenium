package Day_3_Assignment;
import java.util.Arrays;

public class AlphabeticalSort {

	public static void main(String[] args) {
		String ch="welcome";
		
		char arr[]=ch.toCharArray();
		
		Arrays.sort(arr);
		
		String result=new String(arr);
		
		System.out.println("Original: "+ch);
		System.out.println("Sorted  : "+result);
		
	}

}
