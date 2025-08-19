package Day_8;
import java.util.*;
public class LinkedListSearch {
    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<>(Arrays.asList("Apple","Banana","Cherry"));
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter element to search: ");
        String s = sc.nextLine();
        if(list.contains(s)) System.out.println("Found");
        else System.out.println("Not Found");
    }
}
