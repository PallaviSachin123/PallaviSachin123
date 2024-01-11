package logicalProgram;

public class AddTwoArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[] = { 3, 4 };
		int b[] = { 2, 5 };
		int c[] = new int[a.length];
		//int sum = 0;
		for (int i = 0; i < 2; i++) {
			c[i] = a[i] + b[i];

		}
		// System.out.print("a= ");
		System.out.print("{");
		for (int i = 0; i < a.length; i++) {
			System.out.print(" " + a[i] + " ");
		}
		System.out.print("}");

		System.out.print(" + ");
		System.out.print("{");
		for (int i = 0; i < a.length; i++) {
			System.out.print(" " + b[i] + " ");
		}
		System.out.print("}");

		System.out.print(" = ");
		System.out.print("{");
		for (int i = 0; i < a.length; i++) {
			System.out.print(" " + c[i] + " ");
		}
		System.out.print("}");

	}

}
