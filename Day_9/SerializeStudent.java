package Day_9;
/*
Q9. Store Objects in a File using Serialization
Create a Student class with id, name, and marks. Serialize one object and save it in a file named student.ser.
*/
import java.io.*;

class Student implements Serializable {
    int id;
    String name;
    int marks;
    Student(int id, String name, int marks) {
        this.id = id;
        this.name = name;
        this.marks = marks;
    }
}

public class SerializeStudent {
    public static void main(String[] args) throws Exception {
        Student s1 = new Student(101, "Ravi", 85);
        FileOutputStream fos = new FileOutputStream("student.ser");
        ObjectOutputStream oos = new ObjectOutputStream(fos);
        oos.writeObject(s1);
        oos.close();
        fos.close();
        System.out.println("Serialization done successfully");
    }
}
