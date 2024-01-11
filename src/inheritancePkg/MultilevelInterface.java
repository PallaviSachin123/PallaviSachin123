package inheritancePkg;
interface A1{
	default void disp()
	{
		System.out.println("I m in A Interface");
	}
	void dispA();
}
interface B1 extends A1{
	default void disp() 
	{
		A1.super.disp();
		System.out.println("I m in B Interface");
	}
	void dispB();
}
public class MultilevelInterface implements B1{

	public static void main(String[] args) {
		MultilevelInterface m = new MultilevelInterface();
		m.disp();//call B
		m.dispA();//call A
		m.dispB();//call B
		// TODO Auto-generated method stub

	}
	public void disp()
	{
		B1.super.disp();
	}
	@Override
	public void dispA() {
		// TODO Auto-generated method stub
		System.out.println("A disp ");
	}

	@Override
	public void dispB() {
		// TODO Auto-generated method stub
		System.out.println("B disp");
	}

}
