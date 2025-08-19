package Day_8;
import java.util.*;
public class LinkedListAddFirstLast {
    public static void main(String[] args) {
        LinkedList<Integer> nums = new LinkedList<>(Arrays.asList(2,3,4));
        System.out.println("Original: "+nums);
        nums.addFirst(1);
        nums.addLast(5);
        System.out.println("Updated: "+nums);
    }
}
