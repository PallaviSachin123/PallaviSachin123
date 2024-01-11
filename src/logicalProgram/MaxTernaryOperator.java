package logicalProgram;

public class MaxTernaryOperator {

	public static void main(String[] args) {
		int a = 3;
		int b = 5;
		int c = 1;
		int max = a>b?(a>c?a:c):(b>c?b:c);
		System.out.println("max("+a+","+b+","+c+")="+max);
			
	}

}
