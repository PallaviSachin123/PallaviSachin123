package logicalProgram;

public class PerfectNumber {

	public static void main(String[] args) {
		int n=6,sum=0,i=1;
		while(i<n)
		{
			if(n%i==0)
			{
				sum=sum+i;
			}
			i++;
			
		}
		if(n==sum)
		{
			System.out.println("Number is Perfect");
		}
		else
		{
			System.out.println("Number is not perfect");
		}
	}

}
