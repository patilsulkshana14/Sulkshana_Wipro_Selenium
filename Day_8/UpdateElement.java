package Day_8;
import java.util.*;
public class UpdateElement {
    public static void main(String[] args) {
        ArrayList<String> subjects = new ArrayList<>(Arrays.asList("Math","Physics","Chemistry"));
        System.out.println(subjects);
        subjects.set(0,"Statistics");
        System.out.println(subjects);
    }
}
