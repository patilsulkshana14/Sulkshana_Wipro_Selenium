package Day_8;
import java.util.*;
public class LinkedListSort {
    public static void main(String[] args) {
        LinkedList<Integer> nums = new LinkedList<>(Arrays.asList(5,2,8,1,9));
        System.out.println("Original: "+nums);
        Collections.sort(nums);
        System.out.println("Sorted: "+nums);
    }
}
