package Day_3_Assignment;

public class ArrayPalindrome 
{
	public static void main(String[] args) {
        int[] numbers = {10, 20, 30, 20, 10};

        boolean isPalindrome = true;

        for (int i = 0; i < numbers.length / 2; i++) {
            if (numbers[i] != numbers[numbers.length - 1 - i]) {
                isPalindrome = false;
                break;
            }
        }

        if (isPalindrome) {
            System.out.println("The array is a palindrome.");
        } else {
            System.out.println("The array is not a palindrome.");
        }
    }
}
