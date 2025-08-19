package Day_8;

import java.util.LinkedList;
import java.util.Queue;

public class QueueDemo2 {
    public static void main(String[] args) {
        Queue<String> tasks = new LinkedList<>();
        tasks.add("Task1");
        tasks.add("Task2");
        tasks.add("Task3");

        System.out.println("Original Queue: " + tasks);

        System.out.println("Next Task: " + tasks.peek());
        System.out.println("Completed: " + tasks.poll());
        System.out.println("Updated Queue: " + tasks);
    }
}
