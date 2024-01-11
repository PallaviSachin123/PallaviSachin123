package logicalProgram;

public class ArrayOddEvenCount {

	public static void main(String[] args) {
		int arr[] = {2,111,3,9,10,5,11,20,7,31};
		int counteven = 0;
		int countodd = 0;
		for(int i = 0 ;i<arr.length;i++)
		{
			if(arr[i]%2==0)
				counteven++;
			else
				countodd++;
		}
		System.out.println("Number of Even Number = "+counteven);
		System.out.println("Number of Odd Number = "+countodd);
		// TODO Auto-generated method stub

	}

}
