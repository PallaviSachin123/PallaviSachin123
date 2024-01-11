package stringUse;

public class CountCharFromString {

	public static void main(String[] args) {
		String s="malayalam";
		char s1='a';
		int count = 0;
		for(int i = 0; i<s.length();i++)
		{
			if(s.charAt(i)==s1)
				count++;
		}
		System.out.println(count);
		// TODO Auto-generated method stub

	}

}
