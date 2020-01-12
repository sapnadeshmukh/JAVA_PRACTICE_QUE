package logical;

import java.util.Scanner;

public class LargestFactor {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter  a number");
		int num=s.nextInt();
		int result=0;
		int i;
	
		for ( i=1;i<num;i++) {
			if(num%i==0) {
				result=i;
			}
			
		}
		
		System.out.println(i);

		
		
 	}

}
