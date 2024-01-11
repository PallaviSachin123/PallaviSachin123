package interfaceStudy;

public class FinalKeyword1 extends FInalKeyword {

	public void show()//We can not override final method 
	{
		System.out.println("Show method FinalKeyword1");
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FinalKeyword1 f = new FinalKeyword1();
		f.show();
		
	}

}
