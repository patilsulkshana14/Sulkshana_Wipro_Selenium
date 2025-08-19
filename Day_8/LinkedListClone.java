package Day_8;
import java.util.*;
public class LinkedListClone {
    public static void main(String[] args) {
        LinkedList<Integer> list = new LinkedList<>(Arrays.asList(1,2,3,4));
        LinkedList<Integer> clone = (LinkedList<Integer>) list.clone();
        System.out.println("Original: "+list);
        System.out.println("Cloned: "+clone);
    }
}
