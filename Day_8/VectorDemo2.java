package Day_8;

import java.util.Vector;

public class VectorDemo2 {
    public static void main(String[] args) {
        Vector<String> names = new Vector<>();
        names.add("Amit");
        names.add("Raj");
        names.add("Pooja");
        names.add("Neha");

        System.out.println("Original Names Vector: " + names);

        System.out.println("Contains 'Raj'? " + names.contains("Raj"));

        names.set(1, "Ravi");
        System.out.println("After replacing 'Raj' with 'Ravi': " + names);

        names.clear();
        System.out.println("After clearing Vector: " + names);
    }
}
