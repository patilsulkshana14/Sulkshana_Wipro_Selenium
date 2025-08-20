package Day_3_Assignment;
import java.util.Arrays;

public class SecondHighest {

	public static void main(String[] args) {
		int[] arr = {45, 67, 89, 23, 99};
		
		Arrays.sort(arr);
		
		int secHighest=arr[arr.length-2];
		
		System.out.println("Second highest element is: " + secHighest);
	}

}
