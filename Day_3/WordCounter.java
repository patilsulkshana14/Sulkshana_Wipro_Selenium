package Day_3_Assignment;

public class WordCounter {

	public static void main(String[] args) {
		String ch="Java Selinium";
		String count[]= ch.split("\\s+"); // splits a string into array and \\s removes space
		
		System.out.println("Number of words: "+count.length);
	}

}
