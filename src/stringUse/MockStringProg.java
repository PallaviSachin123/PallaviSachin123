package stringUse;

public class MockStringProg {

	public static void main(String[] args) {
		//--------------------logic 1st------------------------
		String s1="Pallavi123Dere4567";
		/*String s2 =s1.replace("123", " ");
		String s3 = s2.replace("4567", "");
		System.out.println("Origanal String = "+s1);
		System.out.println("-------------------------");
		System.out.println("Manipulating String = "+s3);
		// TODO Auto-generated method stub*/
		//------------------------------2nd logic-------------------
		/*char s2[] =s1.toCharArray();
		String result = "";
		for(int i =0;i<s2.length;i++)
		{
			if(!Character.isDigit(s2[i]))
			{
				result= result+s2[i];
			}
		}
		System.out.println("Input String = "+s1);
		System.out.println("Output String = "+result);*/
		//-------------------------3rd logic-----------------------
		//@#$45%TY&^%)*89oj)%%retrive number and charcter
		String a="@#$45%TY&^%)*89oj)%%";
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
