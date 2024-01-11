package inheritancePkg;
class A
{
	int a=10;
	int b=20;
	int c;
	int d;
	public A()
	{
		a=100;
	}
	public A(int c,int d)
	{
		this.c=c;
		this.d=d;
	}
	public void dispA()
	{
		System.out.println("a = "+a+"\nb = "+b);
		System.out.println("c = "+c+"\nd = "+d);
	}
}
class B extends A
{
	int c = 30;
	int e;
	public B()
	{
		super(200,300);
		e = 400;
		int f=c+e;
		System.out.println(f);
	}
	public void dispB()
	{	
		dispA();
		System.out.println("c = "+c);
		System.out.println("e = "+e);
	}
}
public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		B b=new B();
		b.dispB();
	}

}
