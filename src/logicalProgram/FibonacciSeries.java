package logicalProgram;

public class FibonacciSeries {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=0;
		int b=1;
		int c;
		int sum =0;
		System.out.println("Fibbonacci Series is :");
		System.out.print(a+" "+b);
		for(int i = 1;i<=10;i++)
		{
			c=a+b;
			a=b;
			b=c;
			System.out.print(" "+c);
			sum = sum+c;
		}
		System.out.println("\nSum = "+sum);

	}

}
