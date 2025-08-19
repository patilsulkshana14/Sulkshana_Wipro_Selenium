package Day_8;
import java.util.*;
public class ReverseArrayList {
    public static void main(String[] args) {
        ArrayList<Character> list = new ArrayList<>(Arrays.asList('A','B','C','D','E'));
        Collections.reverse(list);
        System.out.println(list);
    }
}
