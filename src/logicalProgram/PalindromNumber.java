package logicalProgram;
import java.util.Scanner;

public class PalindromNumber {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the Number : ");
		int num = s.nextInt();
		int orgno = num;
		int rev = 0;
		
		while(num!=0)
		{
			 
			 rev = rev*10+num%10;
			num = num/10;
		}
		if(orgno==rev)
		{
			System.out.println("Palindom Number");
		}
		else
		{
			System.out.println("Not Palindrom Number");
		}
		
	}

}
