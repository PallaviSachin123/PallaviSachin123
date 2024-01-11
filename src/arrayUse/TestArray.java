package arrayUse;
public class TestArray {

	public static void main(String[] args) {
		boolean a[]= new boolean[2];
		a[0] = true;
		a[1] = false;
		System.out.println(a[0]);
		System.out.println(a[1]);
		int b[] = new int[5];
		b[0] = 10;
		b[1] = 20;
		b[2] = 30;
		b[3] = 40;
		b[4] = 50;
		for(int i = 0; i <5 ; i++) {
			System.out.println(b[i]);

		}		
	}

}
