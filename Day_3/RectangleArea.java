package Day_3_Assignment;

public class RectangleArea {

	void area() {
		float length = 5.8f;
        float width = 4.1f;
        
        float area= length*width;
        
        System.out.println("Area of Rectangle: "+area);
        
	}
	public static void main(String[] args) {
		RectangleArea ra=new RectangleArea();
		
		ra.area();

	}

}
