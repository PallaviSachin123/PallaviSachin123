package mathods;

public class MathsOperation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MathsOperation op = new MathsOperation();
		System.out.println("**Mathematics Operations**\n\n");
		System.out.println("Methods calling from same MathsOperation class");
		
		op.addition();
		op.addition(200, 100);
		op.subtraction(100, 50);
		op.multiplication();
		op.division(5f, 2f);
		System.out.println("\n\n*****************************************");
		System.out.println("Methods calling from Different MathsOperation1 class");
		MathsOperation1 op1 = new MathsOperation1();
		op1.remainder();
		op1.remainder(7, 3);
		MathsOperation1.division();
		MathsOperation1.division(14.2f, 2.0f);
		
	}
	public void addition() {
		int a = 5;
		int b = 6;
		int sum = a+b;
		System.out.println("Addition = "+sum);
	}
	public void addition(int a ,int b) {
		int add=a+b;
		System.out.println("Addition = "+add);
	}
	public void subtraction(int a, int b ) {
		int sub = a-b;
		System.out.println("Subtraction = "+sub);
	}
	public void multiplication() {
		int a = 5;
		int b = 6;
		int mul = a*b;
		System.out.println("Multiplication = "+mul);
	}
	public void division(float a, float b ) {
		float div = a/b;
		System.out.println("Division = "+div);
	}
	

}
