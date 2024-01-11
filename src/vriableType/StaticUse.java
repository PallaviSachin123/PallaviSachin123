package vriableType;

public class StaticUse {
	int b = 40;
	static int a = 100;

	public static void main(String[] args) {
		System.out.println("Value of a = "+a);
		StaticUse st = new StaticUse();
		st.add();
		System.out.println("Value of b = "+st.b);
		Sample  s = new Sample(); 
		
		System.out.println("Value of c = "+s.c);
		System.out.println("Value of different class a  = "+Sample.a);
	}
	public void add()
	{
		System.out.println(a);
		System.out.println(b);
	}

}
