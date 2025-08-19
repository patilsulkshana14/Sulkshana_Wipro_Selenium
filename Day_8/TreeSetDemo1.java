package Day_8;

import java.util.TreeSet;

public class TreeSetDemo1 {
    public static void main(String[] args) {
        TreeSet<String> countries = new TreeSet<>();
        countries.add("India");
        countries.add("USA");
        countries.add("Japan");
        countries.add("Brazil");
        countries.add("Australia");

        System.out.println("Original TreeSet: " + countries);
    }
}
