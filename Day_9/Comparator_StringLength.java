package Day_9;
/*
Q10. Use an anonymous inner class to sort a list of strings by length.
*/
import java.util.*;

public class Comparator_StringLength {
	public static void main(String args[]) {
		List<String> list=Arrays.asList("Java","Python","C","JavaScript");
		Collections.sort(list,new Comparator<String>(){
			public int compare(String s1,String s2){
				return s1.length()-s2.length();
			}
		});
		for(String s:list) {
			System.out.println(s);
		}
	}
}
