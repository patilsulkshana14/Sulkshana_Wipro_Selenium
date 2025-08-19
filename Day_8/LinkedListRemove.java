package Day_8;
import java.util.*;
public class LinkedListRemove {
    public static void main(String[] args) {
        LinkedList<String> animals = new LinkedList<>(Arrays.asList("Dog","Cat","Lion","Tiger"));
        System.out.println("Original: "+animals);
        animals.removeFirst();
        System.out.println("After removeFirst: "+animals);
        animals.removeLast();
        System.out.println("After removeLast: "+animals);
        animals.remove("Cat");
        System.out.println("After removing 'Cat': "+animals);
    }
}
