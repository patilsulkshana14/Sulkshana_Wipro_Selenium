package Day_8;

import java.util.Vector;

public class VectorDemo3 {
    public static void main(String[] args) {
        Vector<Integer> v1 = new Vector<>();
        v1.add(10);
        v1.add(20);
        v1.add(30);

        Vector<Integer> v2 = new Vector<>();
        v2.addAll(v1);

        System.out.println("Vector 1: " + v1);
        System.out.println("Vector 2 (copied): " + v2);
        System.out.println("Are both vectors equal? " + v1.equals(v2));

        int sum = sumVector(v1);
        System.out.println("Sum of elements in Vector 1: " + sum);
    }

    public static int sumVector(Vector<Integer> vec) {
        int sum = 0;
        for (int num : vec) {
            sum += num;
        }
        return sum;
    }
}
