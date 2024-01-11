package mathods;

public class NonStaticMethodSameClass {

	public static void main(String[] args) {
		NonStaticMethodSameClass ob1 = new NonStaticMethodSameClass();
		ob1.test();
		ob1.test1();
		//method call from different class 
		Nonstaticdiffclass ns = new Nonstaticdiffclass();
		ns.foo();

	}
	public void test() {
		//Non static regular complete method
		System.out.println("This is test() method same class");
	}

	public void test1() {
		//Non static regular complete method
		System.out.println("This is test1() method same class");
	}
}
