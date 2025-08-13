package Day_9;
/*
Q2. Create a Product class and sort products by price using Comparable.
Implement Comparable<Product> and sort a list of products using Collections.sort()
*/
import java.util.*;

class Productt {
	int pid;
	double price;
	Productt(int pid,double price){
		this.pid=pid;
		this.price=price;
	}
	public String toString() {
		return pid+" "+price;
	}
}

class PriceComparator implements Comparator<Productt>{
	public int compare(Productt p1,Productt p2) {
		if(p1.price>p2.price) return 1;
		else if(p1.price<p2.price) return -1;
		else return 0;
	}
}

public class Comparator_ProductPrice {
	public static void main(String args[]) {
		List<Productt> plist=Arrays.asList(
				new Productt(101,500.0),
				new Productt(102,150.0),
				new Productt(103,250.0)
				);
		Collections.sort(plist,new PriceComparator());
		for(Productt p:plist) {
			System.out.println(p);
		}
	}
}
