package interfaceStudy;

public class SampleInterfaceClass implements Interface2{
	public void demo1()
	{
		System.out.println("Demo1");
	}
	public void demo2()
	{
		System.out.println("Demo2");
	}
	public void demo3()
	{
		System.out.println("Demo3");
	}
	public void demo4()
	{
		System.out.println("Demo4");
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SampleInterfaceClass s = new SampleInterfaceClass();
		s.demo1();
		s.demo2();
		s.demo3();
		s.demo4();
		System.out.println("Value of a = "+a);

		System.out.println("Value of b = "+b);

		System.out.println("Value of c = "+c);
		}

}
