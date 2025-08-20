package Day_3_Assignment;
import java.util.Scanner;

public class SearchElement {

	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] arr = {10, 20, 30, 40, 50};

        System.out.print("Enter number to search: ");
        int num = sc.nextInt();

        boolean found = false;
        
        for (int i = 0; i < arr.length; i++) 
        {
            if (arr[i] == num) 
            {
                System.out.println(num + " found at position " + (i + 1));
                found = true;
                break;
            }
            
        }
        if(!found)
        {
            System.out.println(num + " not found in the array.");
        }
        
    }
}


