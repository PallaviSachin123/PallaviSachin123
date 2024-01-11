package interfaceStudy;

public class Daughter implements Father,Mother{

	public static void main(String[] args) {
		Daughter d = new Daughter();
		d.hardWork();
		d.honesty();
		d.look();
		d.nature();
		d.love();
		Father.property();
		Mother.property();
		// TODO Auto-generated method stub

	}

	@Override
	public void look() {
		// TODO Auto-generated method stub
		System.out.println("Mother looks completed in Daughter Class");
		
	}

	@Override
	public void nature() {
		// TODO Auto-generated method stub
		System.out.println("Mothers Nature completed in Daughter Class");
	}

	@Override
	public void honesty() {
		// TODO Auto-generated method stub
		System.out.println("Father Honesty completed in Daugher class");
	}

	@Override
	public void hardWork() {
		// TODO Auto-generated method stub
		System.out.println("Father HardWORK completed in Daughter Class");
		
	}
	public void love()
	{
		Father.super.love();
		Mother.super.love();
	}

}
