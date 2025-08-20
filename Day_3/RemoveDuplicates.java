package Day_3_Assignment;

public class RemoveDuplicates 
{
	public static void main(String[] args)
	{
        int[] arr = {5, 2, 8, 2, 5, 3, 9, 8, 1};
        int length = arr.length;

        int[] uarr = new int[length];
        int count = 0;

        for (int i = 0; i < length; i++) 
        {
            boolean seenBefore = false;

            for (int j = 0; j < count; j++) 
            {
                if (arr[i] == uarr[j])
                {
                    seenBefore = true;
                    break;
                }
            }

            if (!seenBefore) 
            {
            	uarr[count] = arr[i];
                count++;
            }
        }

        System.out.print("Array after removing duplicates: ");
        for (int i = 0; i < count; i++) 
        {
            System.out.print(uarr[i] + " ");
        }
    }
}
