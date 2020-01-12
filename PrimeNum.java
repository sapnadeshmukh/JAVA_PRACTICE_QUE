package logical;

import java.util.Scanner;

public class PrimeNum {

	public static void main(String[] args) {
		Scanner n = new Scanner(System.in);
		System.out.println("Enter a number");
		int input=n.nextInt();
		int nof=0;
		for (int i=1;i<=input;i++) {
			if (input%i==0) {
				nof++;
			}
			
		}
		if (nof==2) {
			System.out.println("It is prime number");
		}else {
			System.out.println("It is not prime");
		}
	}
	
}
