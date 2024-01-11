package thisSuperKeywords;
class SuperClass
{
	int a=500;
}
public class ThisUse extends SuperClass {
	int a=100;
	void m1()
	{
		int a=10;
		int sum = a+20;
		System.out.println("Sum  = "+sum);
		int add = this.a+200;
		System.out.println("Add = "+add);
		System.out.println(" SuperClass Variable a = "+super.a);
	}
/*	public static void add()
	{
		int c = this.a + super.a;
		can not use this and super keyword in static method 
		
	}*/
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ThisUse tu = new ThisUse();
		tu.m1();
		
	}

}
