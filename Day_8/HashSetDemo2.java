package Day_8;

import java.util.HashSet;

public class HashSetDemo2 {
    public static void main(String[] args) {
        HashSet<String> cities = new HashSet<>();
        cities.add("Mumbai");
        cities.add("Pune");
        cities.add("Delhi");

        System.out.println("Original HashSet: " + cities);

        cities.remove("Delhi");
        System.out.println("After removing 'Delhi': " + cities);

        System.out.println("Contains 'Pune': " + cities.contains("Pune"));

        cities.clear();
        System.out.println("After clearing: " + cities);
    }
}
