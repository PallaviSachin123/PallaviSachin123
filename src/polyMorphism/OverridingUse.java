package polyMorphism;

class A{
	public void test()
	{
		System.out.println("A's Mwthod test");
	}
}
class B extends A{
	public void test()
	{
		super.test();
		System.out.println("B's Mwthod test");
	}
}

public class OverridingUse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		B b = new B();
		b.test();
	}

}
