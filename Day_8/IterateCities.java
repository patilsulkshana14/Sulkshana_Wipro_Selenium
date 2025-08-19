package Day_8;
import java.util.*;
public class IterateCities {
    public static void main(String[] args) {
        ArrayList<String> cities = new ArrayList<>(Arrays.asList("Pune","Mumbai","Delhi"));
        Iterator<String> it = cities.iterator();
        while(it.hasNext()) System.out.println(it.next());
    }
}
