package stringUse;

public class RetriveNumberCharacter {

	public static void main(String[] args) {
		//@#$45%TY&^%)*89oj)%%retrive number and charcter
				String a="@#$45%TY&^%)*89oj)%%";
				String c = a.replaceAll("(@#$&^*)%", " ");
				
				System.out.println("Using Replace Method = "+c);
				//===================================
				char b[] = a.toCharArray();
				String result = "";
				String result1 = "";
				for(int i =0;i<b.length;i++)
				{
					if(Character.isDigit(b[i]))
					{
						result= result+b[i];
					}
					if(Character.isAlphabetic(b[i]))
					{
						result1= result1+b[i];
					}
				}
				System.out.println(result);
				System.out.println(result1);
			
	}

}
