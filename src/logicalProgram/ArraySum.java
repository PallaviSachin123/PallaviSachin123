package logicalProgram;

public class ArraySum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int arr[] ={-20,25,12,10,40,48,90};
		int sum =0;
		for(int i=0; i<arr.length;i++)
		{
			sum =  sum + arr[i];
			
		}
		System.out.println("Sum of array = "+sum);

	}

}
