package logicalProgram;

public class SwapNumber {

	public static void main(String[] args) {
		int a=10; 
		int b=20;
		int temp;
	//Logic = 1
		System.out.println("Before Swaping Values = "+a+" "+b);
		/*temp = a;
		a = b;
		b = temp;
		System.out.println("After Swaping Values = "+a+" "+b);
		*/
	//logic = 2
		/*a = a+b; //a=10+20=30
		b=a-b;//30-20=10
		a=a-b;//30-10=20
		*/
	//	logic = 3
		/*a=a*b;//20*10=200
		b=a/b;//200/20=10
		a=a/b;//200/10=20*/
	//logic = 4
		a=a^b;
		b=a^b;;
		a=a^b;
		System.out.println("After Swaping Values = "+a+" "+b);
		
	}

}
