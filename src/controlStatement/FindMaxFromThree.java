package controlStatement;

public class FindMaxFromThree {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 9;
		int b = 67;
		int c = 45;
		if(a>b)
		{
			if(a>c)
			{
				System.out.println("A is greater");
			}
			else
			{
				System.out.println("C is greater");
			}
		}
		else
		{
			if(b>c)
			{
				System.out.println("B is greater");
			}
			else
			{
				System.out.println("C is greater");
			}
		}
	}
}
