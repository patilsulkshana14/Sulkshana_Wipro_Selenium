package Day_8;
import java.util.*;
public class LinkedListIterator {
    public static void main(String[] args) {
        LinkedList<String> cities = new LinkedList<>(Arrays.asList("Pune","Mumbai","Delhi"));
        ListIterator<String> it = cities.listIterator();
        System.out.println("Forward:");
        while(it.hasNext()) System.out.println(it.next());
        System.out.println("Reverse:");
        while(it.hasPrevious()) System.out.println(it.previous());
    }
}
