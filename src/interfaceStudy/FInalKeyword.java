package interfaceStudy;

 public class FInalKeyword {
	//if we make any class as final class then we can not extends that class
	static int b=10;
	public static void main(String[] args) {
		
		final int a=12;//we can not reassign value to the final variables
		String b = "Hi";
		System.out.println(a);
		//a=a+20;
		System.out.println(a);
		//a= a+40;
		System.out.println(a);
		System.out.println(b);
	}
	void show()//we can not override final method
	{
		System.out.println("show method from FinalKeyword class");
				
	}

}
