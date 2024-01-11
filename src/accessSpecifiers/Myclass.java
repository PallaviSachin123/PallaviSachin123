package accessSpecifiers;

public class Myclass {
	private int a=8;
		int b = 9;
		protected int  c = 10;
		public int d = 20; 
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Myclass m = new Myclass();
		System.out.println("a = "+m.a);
		System.out.println("b = "+m.b);
		System.out.println("c = "+m.c);
		System.out.println("d = "+m.d);
		
		m.test();
		m.test1();
		m.test2();
		m.test3();
		
	}
	private void test()
	{
		System.out.println("I m Private");
	}
	void test1()
	{
		System.out.println("I m Default");
	}
	protected void test2()
	{
		System.out.println("I m Protected");
	}
	public void test3()
	{
		System.out.println("I m Public");
	}
	

}
