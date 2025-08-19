package Day_8;

import java.util.Vector;
import java.util.Enumeration;

public class VectorDemo1 {
    public static void main(String[] args) {
        Vector<Integer> vec = new Vector<>();
        vec.add(10);
        vec.add(20);
        vec.add(30);
        vec.add(40);
        vec.add(50);

        System.out.println("Original Vector: " + vec);

        vec.insertElementAt(99, 2);
        System.out.println("After inserting at 3rd position: " + vec);

        vec.remove(1);
        System.out.println("After removing 2nd element: " + vec);

        Enumeration<Integer> e = vec.elements();
        System.out.print("Elements using Enumeration: ");
        while (e.hasMoreElements()) {
            System.out.print(e.nextElement() + " ");
        }
        System.out.println();
    }
}
