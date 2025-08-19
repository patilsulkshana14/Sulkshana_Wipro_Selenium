package Day_8;

import java.util.HashSet;

public class HashSetMax {
    public static void main(String[] args) {
        HashSet<Integer> nums = new HashSet<>();
        nums.add(10);
        nums.add(45);
        nums.add(23);
        nums.add(67);

        System.out.println("Original HashSet: " + nums);

        System.out.println("Max Element: " + getMax(nums));
    }

    public static int getMax(HashSet<Integer> set) {
        int max = Integer.MIN_VALUE;
        for (int num : set) {
            if (num > max) {
                max = num;
            }
        }
        return max;
    }
}
