package Day_8;
import java.util.*;
public class LinkedListToArrayList {
    public static void main(String[] args) {
        LinkedList<String> ll = new LinkedList<>(Arrays.asList("A","B","C"));
        ArrayList<String> al = new ArrayList<>(ll);
        System.out.println("LinkedList: "+ll);
        System.out.println("ArrayList: "+al);
    }
}
