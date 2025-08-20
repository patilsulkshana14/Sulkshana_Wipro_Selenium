package Day_3_Assignment;

public class Min_Max 
{
	public static void main(String[] args) 
	{	
		int arr[]= {52,47,22,16,97};
		
		int max=arr[0];
		int min=arr[0];
		
		for(int i=1; i<arr.length;i++)
		{
			if(arr[i]>max)
			{
				max=arr[i];
			}
			else if(arr[i]<min)
			{
				min=arr[i];
			}
			
		}
		System.out.println("Maximum Element is: "+max);
		System.out.println("Minimum Element is: "+min);	
	}

}
