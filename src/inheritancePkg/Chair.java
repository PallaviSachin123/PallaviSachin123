package inheritancePkg;

public class Chair extends Furniture {

	int heigth=10;
	public void dispChair()
	{
		dispFurniture();
		System.out.println("Height  = "+heigth);
	}
}
