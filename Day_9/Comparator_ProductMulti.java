package Day_9;
/*
Q7. Create multiple sorting strategies for a Product class.
Implement comparators to sort by:
Price ascending
Price descending
Name alphabetically
*/
import java.util.*;

class Product {
	int pid;
	String name;
	double price;
	Product(int pid,String name,double price){
		this.pid=pid;
		this.name=name;
		this.price=price;
	}
	public String toString() {
		return pid+" "+name+" "+price;
	}
}

public class Comparator_ProductMulti {
	public static void main(String args[]) {
		List<Product> list=Arrays.asList(
				new Product(1,"Laptop",50000),
				new Product(2,"Mobile",20000),
				new Product(3,"Tablet",15000)
				);
		
		Collections.sort(list,(p1,p2)->Double.compare(p1.price,p2.price));
		Collections.sort(list,(p1,p2)->Double.compare(p2.price,p1.price));
		Collections.sort(list,(p1,p2)->p1.name.compareTo(p2.name));
		
		for(Product p:list) {
			System.out.println(p);
		}
	}
}
