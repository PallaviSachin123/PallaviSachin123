package arrayUse;

public class ArrayMax {

	public static void main(String[] args) {
		int a[] = {11,56,78,43,99,1,23,2,0,33,66};
		int max ;
		int i;
		int j;
		for (i = 0; i < a.length-1; i++)
		{
			for (j = 0; j < a.length-i-1; j++) {
	

			if(a[j]>a[j+1])
			{
				max = a[j];
				a[j] = a[j+1];
				a[j+1] = max;
			}
			//System.out.print(" "+a[i]);
			}
			
		}
		for(i=0;i<a.length;i++)
		{
			System.out.print(" "+a[i]);
		}
		//System.out.print(" "+a[i]);
		//System.out.println("Maximum Number from array = "+max);
	}

}
