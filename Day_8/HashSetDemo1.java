package Day_8;

import java.util.HashSet;
import java.util.Iterator;

public class HashSetDemo1 {
    public static void main(String[] args) {
        HashSet<String> cities = new HashSet<>();
        cities.add("Mumbai");
        cities.add("Pune");
        cities.add("Delhi");
        cities.add("Bangalore");
        cities.add("Chennai");

        System.out.println("Original HashSet: " + cities);

        cities.add("Mumbai");
        System.out.println("After trying to add duplicate 'Mumbai': " + cities);

        Iterator<String> it = cities.iterator();
        System.out.println("Iterating through cities:");
        while (it.hasNext()) {
            System.out.println(it.next());
        }
    }
}
