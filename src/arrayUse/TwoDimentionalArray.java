package arrayUse;

public class TwoDimentionalArray {

	public static void main(String[] args) {
		/*int no[][] = {{10,20},{11,22}};
		System.out.println("Two Dimentional Array:");
		for (int i = 0; i < no.length; i++) {
			for (int j = 0; j < no.length; j++) {
				System.out.print(no[i][j]+" ");
			}
			System.out.println();
		}*/
		String name[][] ={{"Pallavi","Dere"},
				{"Reshma","Jathar"}};
		for (int i = 0; i < name.length; i++) {
			for (int j = 0; j < name.length; j++) {
				System.out.printf("%5s",name[i][j]);
			}
			System.out.println();
		}	
	}

}
