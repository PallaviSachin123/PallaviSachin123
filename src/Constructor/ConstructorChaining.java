package Constructor;
class Department
{
	int a;
	int b;
	public Department()
	{
		a=10;
		b=20;
	}
	public Department(int x, int y)
	{
		a=x;
		b=y;
	}
	public void displayD()
	{
		System.out.println("Value of a = "+a);
		System.out.println("Value of b = "+b);
	}
}
class Employee1 extends Department
{
	int c;
	public Employee1()
	{   //super();
		c=30;
	}
	public Employee1(int z) 
	{	
		super(100,200);
		c=z;
	}
	public void displayE()
	{
		displayD();
		System.out.println("Value of c = "+c);
	}
}

public class ConstructorChaining {

	public static void main(String[] args) {
		Employee1 e = new Employee1();
		e.displayE();
		Employee1 e1 = new Employee1(300);
		e1.displayE();
		// TODO Auto-generated method stub

	}

}
