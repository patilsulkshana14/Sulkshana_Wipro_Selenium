package Day_3_Assignment;

public class EvenOddSeparation 
{
	public static void main(String[] args) 
	{
        int[] inputArray = {5, 2, 8, 1, 3, 4, 6, 7, 10};

        int[] evenNumbers = new int[inputArray.length];
        int[] oddNumbers = new int[inputArray.length];
        int evenIndex = 0, oddIndex = 0;

        for (int num : inputArray) 
        {
            if (num % 2 == 0) 
            {
                evenNumbers[evenIndex++] = num;
            } 
            else 
            {
                oddNumbers[oddIndex++] = num;
            }
        }
        
        System.out.print("Even Numbers: ");
        for (int i = 0; i < evenIndex; i++) 
        {
            System.out.print(evenNumbers[i] + " ");
        }

        System.out.println();

        System.out.print("Odd Numbers: ");
        for (int i = 0; i < oddIndex; i++) 
        {
            System.out.print(oddNumbers[i] + " ");
        }
    }
}
