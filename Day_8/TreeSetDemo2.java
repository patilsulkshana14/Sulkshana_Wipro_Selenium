package Day_8;

import java.util.TreeSet;

public class TreeSetDemo2 {
    public static void main(String[] args) {
        TreeSet<Integer> numbers = new TreeSet<>();
        numbers.add(10);
        numbers.add(5);
        numbers.add(20);
        numbers.add(15);

        System.out.println("Original TreeSet: " + numbers);

        System.out.println("First Element: " + numbers.first());
        System.out.println("Last Element: " + numbers.last());
        System.out.println("Lower than 15: " + numbers.lower(15));
        System.out.println("Higher than 15: " + numbers.higher(15));
    }
}
