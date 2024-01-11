package accessSpecifier1;

import accessSpecifiers.Myclass;

public class Myclass2 extends Myclass{
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Myclass m = new Myclass();
		m.test3();
		Myclass2 m2 = new Myclass2();
		m2.test2();//protected call here in other package when using inheritance and create object of subclass
		m2.test3();
	}

}
