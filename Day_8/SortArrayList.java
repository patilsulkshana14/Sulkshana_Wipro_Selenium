package Day_8;
import java.util.*;
public class SortArrayList {
    public static void main(String[] args) {
        ArrayList<Integer> nums = new ArrayList<>(Arrays.asList(5,2,8,1,9,3,7));
        Collections.sort(nums);
        System.out.println(nums);
    }
}
