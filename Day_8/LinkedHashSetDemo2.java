package Day_8;

import java.util.LinkedHashSet;
import java.util.Objects;

class Student1 {
    int id;
    String name;

    Student1(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public int hashCode() {
        return Objects.hash(id, name);
    }

    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (!(obj instanceof Student1)) return false;
        Student1 s = (Student1) obj;
        return id == s.id && name.equals(s.name);
    }

    public String toString() {
        return id + " - " + name;
    }
}

public class LinkedHashSetDemo2 {
    public static void main(String[] args) {
        LinkedHashSet<Student1> students = new LinkedHashSet<>();
        students.add(new Student1(1, "Amit"));
        students.add(new Student1(2, "Priya"));
        students.add(new Student1(3, "Rahul"));
        students.add(new Student1(1, "Amit"));

        System.out.println("Original LinkedHashSet: " + students);
    }
}
