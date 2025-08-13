package Day_9;
/*
Q4. Sort a list of Book objects by bookId in descending order using Comparable.
Hint: Override compareTo() to return the reverse order
*/
import java.util.*;

public class Camparable_Book implements Comparable<Camparable_Book>{
	int bid;
	String bname;
	
	Camparable_Book(int bid,String bname){
		this.bid=bid;
		this.bname=bname;
	}
	
	public int compareTo(Camparable_Book o) {
		return o.bid - this.bid;
	}
	
	public String toString() {
		return bid+" "+bname;
	}
	
	public static void main(String args[]) {
		List<Camparable_Book> books=Arrays.asList(
				new Camparable_Book(103,"Java Basics"),
				new Camparable_Book(101,"Python Fundamentals"),
				new Camparable_Book(105,"Data Structures")
				);
		Collections.sort(books);
		books.forEach(System.out::println);
	}
}
