package Day_8;
import java.util.*;
public class SearchElement {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(10, 20, 30, 40, 50));
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number to search: ");
        int num = sc.nextInt();
        if (list.contains(num)) System.out.println("Found");
        else System.out.println("Not Found");
    }
}
