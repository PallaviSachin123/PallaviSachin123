package controlStatement;

public class PrintTableOf5 {

	public static void main(String[] args) {
		System.out.println("Table of 9 using for Arithmetic operator");
		System.out.println("\n*****************************************");
		
		for(int a=1;a<=10;a++)
		{
			System.out.print(" "+a*9);
		}
		System.out.println("\n*****************************************");
		System.out.println("Table of 5 using for increament operator");
		System.out.println("\n*****************************************");
		
		for(int i=5;i<=50;i=i+5)
		{
			System.out.print(" "+i);
		}
		System.out.println("\n*****************************************");
		System.out.println("Table of 6 using while");
		System.out.println("\n*****************************************");
		
		int j=6;
		while(j<=60)
		{
			System.out.print(" "+j);
			j=j+6;
			
		}

	}

}
