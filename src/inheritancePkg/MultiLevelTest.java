//Multilevel Inheritance
package inheritancePkg;
class F{
	int a=10;
	int b=20;
	public void add()
	{
		int sum = a+b;
		System.out.println("Addition = "+sum);
	}
	
}
class D extends F{
	int c=100;
	int d =200;
	public void sub()
	{
		int sub = c-d;
		System.out.println("Subtraction  = "+sub);
	}
}
class C extends D{
	int e=50;
	int f =40;
	public void mul()
	{
		int prod = e*f;
		System.out.println("Subtraction  = "+prod);
	}
}

public class MultiLevelTest {

	public static void main(String[] args) {
		C c = new C();
		c.add();
		c.sub();
		c.mul();
		// TODO Auto-generated method stub

	}

}
