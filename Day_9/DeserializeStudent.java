package Day_9;
import java.io.*;

public class DeserializeStudent {
    public static void main(String[] args) throws Exception {
        FileInputStream fis = new FileInputStream("student.ser");
        ObjectInputStream ois = new ObjectInputStream(fis);
        Student s1 = (Student) ois.readObject();
        System.out.println("Student [id=" + s1.id + ", name=" + s1.name + ", marks=" + s1.marks + "]");
        ois.close();
        fis.close();
        System.out.println("DeSerialization done successfully");
    }
}
