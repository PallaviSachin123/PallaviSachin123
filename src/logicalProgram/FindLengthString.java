package logicalProgram;

public class FindLengthString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s= "Pallavi";
		int i=0;
		while(true)
		{
			try
			{
			//String s1 = new String();
			s.charAt(i);
			i++;
			}
			catch (StringIndexOutOfBoundsException e) {
				// TODO: handle exception
				break;
			}
		}
		System.out.println(i);
		

	}

}
