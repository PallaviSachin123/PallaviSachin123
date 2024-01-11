
package controlStatement;

public class If_Else_Ladder {

	public static void main(String[] args) {
		int a = 10;
		int b = 11;
		int c = 22;
		System.out.println("Find the Maximum number from three numbers a,b,c\n");
		System.out.println("************************************");
		
		if(a>b)
		{
			if(a>c)
			{
				System.out.println("Number a = "+a+" is greater");
			}
			else
			{
				System.out.println("Number c = "+c+" is greater");
			}
			
		}
		else
		{
			if(b>c)
			{
				System.out.println("Number b = "+b+" is greater");
			}
			else
			{
				System.out.println("Number c = "+c+" is greater");
			}
			
		}
		System.out.println("************************************");
		
	}

}
