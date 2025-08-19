package Day_8;
import java.util.*;
public class CopyArrayList {
    public static void main(String[] args) {
        ArrayList<String> list1 = new ArrayList<>(Arrays.asList("A","B","C"));
        ArrayList<String> list2 = new ArrayList<>();
        
        System.out.println("Original Array List: "+list1);
        list2.addAll(list1);
        System.out.println("Copied Array List: "+list2);
    }
}
