package Day_8;
import java.util.*;
class Student {
    int id; String name; int marks;
    Student(int id,String name,int marks){this.id=id;this.name=name;this.marks=marks;}
}
public class StudentList {
    public static void main(String[] args) {
        ArrayList<Student> list = new ArrayList<>();
        list.add(new Student(1,"A",90));
        list.add(new Student(2,"B",85));
        list.add(new Student(3,"C",92));
        for(Student s:list) System.out.println(s.id+" "+s.name+" "+s.marks);
    }
}
