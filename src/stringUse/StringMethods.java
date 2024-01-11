package stringUse;

//import org.w3c.dom.ls.LSOutput;

public class StringMethods {
	

		public static void main(String[] args) {
			// TODO Auto-generated method stub
			String a = "Pallavi is my name";
			String b = "Pallavi";
			String c = new String("Pallavi");
			String d = "pallavi";
			String e = "INDIA IS ";
			String f = "";
			String g = " ";
			String h = "MY COUNTRY";
			System.out.println("Length of Pallavi");
			System.out.println(a.length());
			System.out.println("Check Memory Location");
			System.out.println(a==b);//Same Memory Location
			System.out.println(a==c);//different memory location
			System.out.println("Check Memory Content");
			System.out.println(a.equals(b));//same content
			System.out.println(a.equals(c));//same content
			System.out.println(a.equals(d));//different content
			System.out.println("Convert to Upper Case");
			System.out.println(d.toUpperCase());
			System.out.println("Convert to Lower Case");
			System.out.println(e.toLowerCase());
			System.out.println("**Equal method without case checking**");
			System.out.println(a.equalsIgnoreCase(d));
			System.out.println("INDIA Contains IN ");
			System.out.println(e.contains("IN"));
			System.out.println("**checking Is Empty**");
			System.out.println(f.isEmpty());
			System.out.println(g.isEmpty());
			System.out.println("**Giving index using charAt**");			
			System.out.println(e.charAt(4));
			System.out.println("**Cheacking ending with**");
			System.out.println(a.endsWith("avi"));
			System.out.println(a.endsWith("Pal"));
			System.out.println("**Checking Starting wih**");
			System.out.println(a.startsWith("Pal"));
			System.out.println("**Sub String**");
			System.out.println(a.substring(3));
			System.out.println("**Concatination String**");
			String i = e.concat(h);
			System.out.println(i);
			System.out.println(h.indexOf('C'));
			System.out.println("**Last Index Of**");
			System.out.println(a.lastIndexOf('a'));
			System.out.println("**Replace String**");
			System.out.println(a.replace('P', 'S'));
			System.out.println(i.replaceAll(" " ,"_"));
			System.out.println("**Split**");
			String s="Pallavi Sachin Dere";
			String []s1 = s.split(" ");
			System.out.println(s1[0]);
			System.out.println(s1[1]);
			System.out.println(s1[2]);

			//System.out.println(i.split(" "));
			String s2 = "   Pallavi  ";
			System.out.println("Uses of trim");
			int x=s2.length();
			System.out.println(x);//12
			String s3 = s2.trim();
			System.out.println(s3);//Pallavi
			int y = s3.length();
			System.out.println(y);//7
		}

	}



