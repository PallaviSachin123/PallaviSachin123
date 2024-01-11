package interfaceStudy;

public abstract interface Father {// can we write abstract keyword beforer interface ? Ans -Yes. 
	void honesty();
	void hardWork();
	private void color()
	{
		System.out.println("color is fair");
	}
	default void love()
	{
		color();
		System.out.println("Fathers love");
	}
	static void property()
	{
		System.out.println("Fathers property");
	}
}
