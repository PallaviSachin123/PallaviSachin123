package logicalProgram;

public class ArrayElementSum {

	public static void main(String[] args) {
		int array[] = {11,32,13,4,15};
		int sum = 0;
		for(int i=0;i<array.length;i++)
		{
			sum = sum +array[i];
			
		}
		System.out.println("Sum of Array Element = "+sum);
	}

}
