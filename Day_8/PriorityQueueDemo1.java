package Day_8;

import java.util.PriorityQueue;
import java.util.Comparator;

class Patient {
    String name;
    int severityLevel;

    Patient(String name, int severityLevel) {
        this.name = name;
        this.severityLevel = severityLevel;
    }

    public String toString() {
        return name + " (Severity: " + severityLevel + ")";
    }
}

public class PriorityQueueDemo1 {
    public static void main(String[] args) {
        PriorityQueue<Patient> hospitalQueue = new PriorityQueue<>(Comparator.comparingInt((Patient p) -> p.severityLevel).reversed());

        hospitalQueue.add(new Patient("John", 2));
        hospitalQueue.add(new Patient("Alice", 5));
        hospitalQueue.add(new Patient("Bob", 3));

        System.out.println("Original Queue: " + hospitalQueue);

        while (!hospitalQueue.isEmpty()) {
            System.out.println("Serving: " + hospitalQueue.poll());
            System.out.println("Updated Queue: " + hospitalQueue);
        }
    }
}
