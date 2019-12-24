package logical;

import java.util.Scanner;

public class SwitchCaseTest {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Area of a Circle");

		System.out.println("Enter your option:");
		int op = s.nextInt();
		switch (op) {
		case 1:
			System.out.println("Enter length and breadth:");
			int l = s.nextInt();
			int b = s.nextInt();
			int ar = l * b;
			System.out.println("Area:" + ar);
			break;

		case 2:
			System.out.println("Enter radius:");
			float r = s.nextFloat();
			float ac = 3.14f * r * r;
			System.out.println("Area:" + ac);
			break;

		case 3:
			System.out.println("Enter side:");
			int X = s.nextInt();
			int p = 4 * X;
			System.out.println("Perimeter:" + p);
			break;
		}
	}

}
spna 
