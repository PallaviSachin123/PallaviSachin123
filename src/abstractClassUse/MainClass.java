package abstractClassUse;
abstract class Data//can we write interface keyword before abstract class ? Ans - No.
{
	abstract void showData();
}
class NationalSchool extends Data
{
	void showData()
	{
		System.out.println("This is the National School Data");
	}
}
class IndianSchool extends Data
{
	void showData()
	{
		System.out.println("This is the Indian School Data");
	}
	
}

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Data d = new IndianSchool();
		d.showData();
		Data d1 = new NationalSchool();
		d1.showData();
	}

}
