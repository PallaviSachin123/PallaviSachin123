//Hierachical Inheritance
package inheritancePkg;


class Area{
	int a=10;
	int b=20;
	public void add()
	{
		int c;
		c=a+b;
		System.out.println("C = "+c);
	}
	
}
class Rectangle extends Area{
	int r;
	public void Rect()
	{
		r=a*b;
		System.out.println("Area of rectangle = "+r);
	}
}
class Circle1 extends Area{
	double c;
	public void circleArea() {
		c= 		3.14*a*a;
		System.out.println("Area of Circle = "+c);
	}
	
	
	
	
	
}
public class HierachicalTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Rectangle r = new Rectangle();
		r.Rect();
		r.add();
		Circle1 c = new Circle1();
		c.circleArea();
		c.add();
	}

}
