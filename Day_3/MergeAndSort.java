package Day_3_Assignment;
import java.util.Arrays;

public class MergeAndSort 
{
    public static void main(String[] args) 
    {
    	int[] array1 = {30, 10, 50};
	    int[] array2 = {20, 40, 60};

	    int length1 = array1.length;
	    int length2 = array2.length;

	    int[] merged = new int[length1 + length2];

	     for (int i = 0; i < length1; i++) 
	     {
	            merged[i] = array1[i];
	     }
	     for (int i = 0; i < length2; i++) 
	     {
	            merged[length1 + i] = array2[i];
	     }

	    Arrays.sort(merged);

	    System.out.println("Merged and sorted array:");
	    for (int num : merged) 
	    {
	            System.out.print(num + " ");
	    }
	}
}


