package Day_9;
/*
Q12. Sort a list of Book objects using both Comparable (by ID) and Comparator (by title, then author).
*/
import java.util.*;

class BookDetails implements Comparable<BookDetails> {
	int id;
	String title;
	String author;
	BookDetails(int id,String title,String author){
		this.id=id;
		this.title=title;
		this.author=author;
	}
	public int compareTo(BookDetails o) {
		return this.id - o.id;
	}
	public String toString() {
		return id+" "+title+" "+author;
	}
}

public class BookSortBoth {
	public static void main(String args[]) {
		List<BookDetails> list=Arrays.asList(
				new BookDetails(3,"Java","John"),
				new BookDetails(1,"Python","Mike"),
				new BookDetails(2,"C++","Adam")
				);
		Collections.sort(list);
		Collections.sort(list,(b1,b2)->{
			int cmp = b1.title.compareTo(b2.title);
			if(cmp==0) return b1.author.compareTo(b2.author);
			return cmp;
		});
		for(BookDetails b:list) {
			System.out.println(b);
		}
	}
}
