package inheritancePkg;
class Fruit
{
	void dispF()
	{
		System.out.println("I m in Fruit");
	}
}

class Mango extends Fruit
{
	void dispM()
	{
		dispF();
		System.out.println("I m in mango");
	}
}

class Apple extends Fruit
{
	void dispA()
	{
		dispF();
		System.out.println("I m in Apple");
	}
}
public class HierarchicalInheritance {

	public static void main(String[] args) {
		Mango m = new Mango();
		Apple a  = new Apple();
		m.dispM();
		a.dispA();
	}

}
