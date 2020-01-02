package logical;

import java.util.Scanner;

public class SwitchCaseTest {

	public static void main(String[] args) {
	    //Declaring a variable for switch expression  

		Scanner s = new Scanner(System.in);

		System.out.println("Enter your option:");
		int op = s.nextInt();
	    //Switch expression  

		switch (op) {
	    //Case statements  

		case 1:
			System.out.println("Enter length and breadth of rectangle:");
			int l = s.nextInt();
			int b = s.nextInt();
			int ar = l * b;
			System.out.println("Area of rectangle:" + ar);
			int pr=2 *(l+b);
			System.out.println("Perimeter of rectangle :" +pr);
			break;

		case 2:
			System.out.println("Enter radius for circle:");
			float r = s.nextFloat();
			float ac = 3.14f * r * r;
			System.out.println("Area of circle:" + ac);
			float pc= 2 * 3.14f *r;
			System.out.println("perimeter of circle:" + pc );
			break;

		case 3:
			System.out.println("Enter length and breadth for Triangle");
			float s1=s.nextInt();
			float s2=s.nextInt();
			float s3=s.nextInt();
			float areaofTr = (s1*s2/2);
			System.out.println("Area of Triangle:" + areaofTr);
			float pt=s1+s2+s3;
			System.out.println("Perimeter of Triangle:"+ pt);
			break;
		}
	}

}
