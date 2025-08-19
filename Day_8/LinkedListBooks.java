package Day_8;
import java.util.*;
class Book {
    int id; String title, author;
    Book(int id,String title,String author){this.id=id;this.title=title;this.author=author;}
}
public class LinkedListBooks {
    public static void main(String[] args) {
        LinkedList<Book> books = new LinkedList<>();
        books.add(new Book(1,"Java","John"));
        books.add(new Book(2,"Python","Mike"));
        books.add(new Book(3,"C++","Sara"));
        for(Book b:books) System.out.println(b.id+" "+b.title+" "+b.author);
    }
}
