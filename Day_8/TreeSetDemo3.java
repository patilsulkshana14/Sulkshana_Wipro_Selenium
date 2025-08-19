package Day_8;

import java.util.Comparator;
import java.util.TreeSet;

public class TreeSetDemo3 {
    public static void main(String[] args) {
        TreeSet<String> words = new TreeSet<>(Comparator.reverseOrder());
        words.add("Apple");
        words.add("Orange");
        words.add("Banana");
        words.add("Grapes");

        System.out.println("TreeSet in Reverse Order: " + words);
    }
}
