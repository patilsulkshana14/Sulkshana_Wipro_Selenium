package Day_8;

import java.util.PriorityQueue;
import java.util.Comparator;

class PrintJob {
    String jobName;
    int priority;

    PrintJob(String jobName, int priority) {
        this.jobName = jobName;
        this.priority = priority;
    }

    public String toString() {
        return jobName + " (Priority: " + priority + ")";
    }
}

public class PriorityQueueDemo2 {
    public static void main(String[] args) {
        PriorityQueue<PrintJob> printQueue = new PriorityQueue<>(Comparator.comparingInt((PrintJob p) -> p.priority).reversed());

        printQueue.add(new PrintJob("Document1", 1));
        printQueue.add(new PrintJob("Document2", 3));
        printQueue.add(new PrintJob("Document3", 2));

        System.out.println("Original Queue: " + printQueue);

        while (!printQueue.isEmpty()) {
            System.out.println("Printing: " + printQueue.poll());
            System.out.println("Updated Queue: " + printQueue);
        }
    }
}
