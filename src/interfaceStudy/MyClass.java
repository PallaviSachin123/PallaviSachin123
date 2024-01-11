package interfaceStudy;

public class MyClass implements MyInterface{
	public void test()
	{
		System.out.println("Method completion in Implementation class");
	}
	public static void main(String[] args) {
		MyClass m  = new MyClass();
		m.test();
		
		// TODO Auto-generated method stub

	}

}
