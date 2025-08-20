package Day_3_Assignment;

public class PrimeNumbersArray 
{
	public static void main(String[] args) {
        int[] arr = {10, 7, 15, 2, 3, 4, 5, 19};

        System.out.println("Prime numbers in the array:");

        for (int i = 0; i < arr.length; i++) {
            int num = arr[i];
            boolean isPrime = true;

            if (num <= 1) {
                isPrime = false;
            } else {
                for (int j = 2; j <= num / 2; j++) {
                    if (num % j == 0) {
                        isPrime = false;
                        break;
                    }
                }
            }

            if (isPrime) {
                System.out.print(num + " ");
            }
        }
    }
}
