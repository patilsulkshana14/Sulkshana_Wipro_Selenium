package Day_3_Assignment;

public class VowelCounter {

	public static void main(String[] args) {
		String input="Programming";
		int count=0;
		
		for(int i=0; i<input.length(); i++)
		{
			char ch=Character.toLowerCase(input.charAt(i));
			
			if(ch=='a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                count++;
            }
		}
		System.out.println("Number of Vowels: " + count);
	}

}
