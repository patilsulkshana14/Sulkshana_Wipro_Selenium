package Day_8;

import java.util.LinkedHashSet;

public class LinkedHashSetMerge {
    public static void main(String[] args) {
        LinkedHashSet<String> set1 = new LinkedHashSet<>();
        set1.add("A");
        set1.add("B");

        LinkedHashSet<String> set2 = new LinkedHashSet<>();
        set2.add("C");
        set2.add("D");

        System.out.println("Set 1: " + set1);
        System.out.println("Set 2: " + set2);

        set1.addAll(set2);
        System.out.println("Merged LinkedHashSet: " + set1);
    }
}
