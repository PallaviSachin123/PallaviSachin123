package logicalProgram;

public class ArmstrongNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 153;
		int temp = n;
		int sum = 0;
	
		while(n>0)
		{
			int r=n%10;
			sum =sum + (r*r*r);
			n=n/10;
		}
		
		
		if(temp==sum)
		{
			System.out.println("The number " +temp+" is Armstong");
		}
		else
		{
			System.out.println("The number is not armstrong");
		}
		
	}

}
