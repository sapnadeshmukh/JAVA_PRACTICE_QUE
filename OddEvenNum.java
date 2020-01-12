package logical;

import java.util.Scanner;

public class OddEvenNum {

	public static void main(String[] args) {
		Scanner n = new Scanner(System.in);
		System.out.println("enter any number");
		int num = n.nextInt();
		if (num%2==0) {
			System.out.println("It is even Number");
		}else {
			System.out.println("It is odd Number");
		}
	}

}
