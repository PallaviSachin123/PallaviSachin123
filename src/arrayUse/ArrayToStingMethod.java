//Trying to print Array To Demonstrate that toString works if we want to print single dimentional array 
//but doesn't work for multidimentional array

package arrayUse;

import java.util.Arrays;

public class ArrayToStingMethod {

	public static void main(String[] args) {
	String[] str = new String[] {"practice,automation.org","www.automation.org"};
	System.out.println(Arrays.toString(str));
	//Trying to print multidimentional Array using toString
	int mat[][]= new int[2][2];
	mat[0][0]=99;
	mat[0][1]=98;
	mat[1][0]=100;
	mat[1][1]=101;
	System.out.println(Arrays.toString(mat));
	}

}
