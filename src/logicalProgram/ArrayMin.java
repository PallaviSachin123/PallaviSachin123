package logicalProgram;

public class ArrayMin {

	public static void main(String[] args) {
		int arr[] = {100,20,45,78,98};
		int min=999999;
		for(int i=0;i<arr.length;i++)
		{
			if(min>arr[i])
			{
				min = arr[i];
				
			}
		}
		System.out.println("Min = "+min);

	}

}
