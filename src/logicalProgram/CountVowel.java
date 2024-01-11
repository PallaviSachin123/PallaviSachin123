package logicalProgram;

public class CountVowel {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "Hey Everyone";
		int count = 0;
		s= s.toLowerCase();
		System.out.print("Original String = "+s+"\nVowels = ");
		for(int i=0;i<=s.length()-1;i++)
		{
			char ch = s.charAt(i);
			if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u')
			{
				count++;
			
			System.out.print(ch+" ");
			}
		}
		System.out.println("\nTotal no. of vowels = "+count);


	}

}
