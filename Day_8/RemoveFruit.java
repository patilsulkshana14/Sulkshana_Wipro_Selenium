package Day_8;
import java.util.*;
public class RemoveFruit {
    public static void main(String[] args) {
        ArrayList<String> fruits = new ArrayList<>(Arrays.asList("Apple","Banana","Mango","Grapes","Orange"));
        fruits.remove("Mango");
        System.out.println(fruits);
    }
}
