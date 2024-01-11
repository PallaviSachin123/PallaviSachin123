package polyMorphism;

public class OverloadingUse {
	
	public void add()
	{
		int a = 10;
		int b = 20;
		int sum = a+b;
		System.out.println("Sum  = "+sum);
	}
	public void add(int a,int b)
	{
		//int a = 10;
		//int b = 20;
		int sum = a+b;
		System.out.println("Sum  = "+sum);
	}
	public void add(float a, float b)
	{
		float sum = a+b;
		System.out.println("Sum  = "+sum);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		OverloadingUse ov = new OverloadingUse();
		ov.add();
		ov.add(10, 10);
		ov.add(12.5f, 12.5f);
		
	}

}
