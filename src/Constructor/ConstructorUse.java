package Constructor;

public class ConstructorUse {
	int a;
	int b;
	int c;
	public ConstructorUse() { // bydefault call this constructor
		a = 1;
		b = 2;
		c = 3;
		
	}
	public ConstructorUse(int x) {
		a=x;
	}

	public ConstructorUse(int x, int y) {
		a = x;
		b = y;
	}
	public ConstructorUse(int x, int y, int z) {
		a = x;
		b = y;
		c = z;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		ConstructorUse cu  = new ConstructorUse();
		cu.addition();
		ConstructorUse cu1 = new ConstructorUse(100);
		cu1.addition();
		ConstructorUse cu2 = new ConstructorUse(100, 200);
		cu2.addition();
		ConstructorUse cu3 = new ConstructorUse(100, 200, 300);
		cu3.addition();
	}
	public void addition() {
		int sum = a+b+c;
		System.out.println("***********************");
		
		System.out.println("Value of a = "+a);
		System.out.println("Value of b = "+b);
		System.out.println("Value of c = "+c);
		System.out.println("Sum = "+sum);
		System.out.println("***********************");
	}

}
