package Day_8;

import java.util.Deque;
import java.util.LinkedList;
import java.util.Scanner;

public class DequeDemo1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String str = sc.nextLine();

        Deque<Character> deque = new LinkedList<>();
        for (char c : str.toCharArray()) {
            deque.add(c);
        }

        System.out.println("Original Deque: " + deque);

        boolean isPalindrome = true;
        while (deque.size() > 1) {
            if (deque.removeFirst() != deque.removeLast()) {
                isPalindrome = false;
                break;
            }
        }

        if (isPalindrome)
            System.out.println("Palindrome");
        else
            System.out.println("Not a Palindrome");
    }
}
