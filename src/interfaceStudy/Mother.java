package interfaceStudy;

public abstract interface Mother {
	void look();
	void nature();
	default void love()
	{
		System.out.println("Mothers love");
	}
	static void property()
	{
		System.out.println("Mothers property");
	}
}
