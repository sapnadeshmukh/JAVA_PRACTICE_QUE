package logical;

import java.util.Scanner;

public class SumNum {

	public static void main(String[] args) {
		Scanner n = new Scanner(System.in);
		System.out.println("enter any number");
		int num = n.nextInt();
		int sum = 0;
		for (int index = 2; index <= num; index++) {
			sum = sum + index;
		}
		System.out.println("The total sum is:" + sum);

	}
}
