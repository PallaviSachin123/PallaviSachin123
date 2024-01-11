package inheritancePkg;

public class ClassStd extends School {
	int std;
	char div;
	public void dispClassStd()
	{
		dispSchool();
		System.out.println("Standard         = "+std);
		System.out.println("Division         = "+div);
	}
	
	

}
