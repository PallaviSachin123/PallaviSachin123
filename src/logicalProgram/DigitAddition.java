package logicalProgram;

public class DigitAddition {

	public static void main(String[] args) {
		int no = 999;
		int sum = 0;
		while(no!=0)
		{
			sum = sum+ no%10;
			no=no/10;
			//sum = sum +n;
		}
		System.out.println("Sum of digit = "+sum);

		// TODO Auto-generated method stub

	}

}
