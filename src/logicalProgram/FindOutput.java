package logicalProgram;

public class FindOutput {
	public void foo(int a,float b)
	{
		System.out.println("Jai Shree Ram");
	}
	public void foo(float a,int b)
	{
		System.out.println("Jai Shree Krishna");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FindOutput f = new FindOutput();
		f.foo(10,20f);
		

	}

}
