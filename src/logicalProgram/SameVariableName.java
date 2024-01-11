package logicalProgram;

public class SameVariableName {
	int x,y;
	public void add(int x, int y)
	{
		this.x=x;
		this.y=y;
		int z = x+y;
		System.out.println(z);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SameVariableName s = new SameVariableName();
		s.add(10, 20);
	}

}
