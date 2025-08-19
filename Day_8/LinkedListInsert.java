package Day_8;
import java.util.*;
public class LinkedListInsert {
    public static void main(String[] args) {
        LinkedList<String> names = new LinkedList<>(Arrays.asList("John","Mike","Sara"));
        System.out.println("Original: "+names);
        names.add(2,"Emma");
        System.out.println("Updated: "+names);
    }
}
