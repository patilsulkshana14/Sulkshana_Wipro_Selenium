package Day_8;

import java.util.PriorityQueue;

public class PriorityQueueDemo3 {
    public static void main(String[] args) {
        PriorityQueue<Integer> pq1 = new PriorityQueue<>();
        pq1.add(5);
        pq1.add(1);
        pq1.add(9);

        PriorityQueue<Integer> pq2 = new PriorityQueue<>();
        pq2.add(4);
        pq2.add(7);
        pq2.add(2);

        System.out.println("Original PQ1: " + pq1);
        System.out.println("Original PQ2: " + pq2);

        pq1.addAll(pq2);

        System.out.println("Merged and Sorted PQ: " + pq1);
    }
}
