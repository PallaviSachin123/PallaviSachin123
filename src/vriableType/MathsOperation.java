package vriableType;

public class MathsOperation {
	int a = 10;;
	static int b = 100;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MathsOperation  mo = new MathsOperation();
		int sum = 10 + mo.a;
		System.out.println("Sum = "+sum);
		int sub = 200 - b;
		System.out.println("Sub = "+sub);
		Sample1 s1 = new Sample1();
		int mul = 10 * s1.m;
		System.out.println("Mul = "+mul);
		int div = 100 / Sample1.n;
		System.out.println("Div = "+div);
	}

}
