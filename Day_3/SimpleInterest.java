package Day_3_Assignment;

public class SimpleInterest {

	void calInterest() {
		
		float principal = 1000;
        float rate = 5;
        float time = 2;
        float Interest = (principal * rate * time) / 100;
        
        System.out.println("Simple Interest = " + Interest);
	}
	public static void main(String[] args) {
		SimpleInterest si= new SimpleInterest();
		
		si.calInterest();

	}

}
