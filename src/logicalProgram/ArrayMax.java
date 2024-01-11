package logicalProgram;

public class ArrayMax {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = { 100,20,90,40,50};
		int max = -9999;
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]>max)
			{
				max=arr[i];
			}
			
		}
		System.out.println("Max = "+max);
	}

}
