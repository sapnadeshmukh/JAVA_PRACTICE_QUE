package logical;

import java.util.Scanner;

public class ThirdWordOfSentence {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("enter any string");
		String song1 = in.nextLine();
		String[] s=song1.split("\\s");
		System.out.println(s[2]);
		
		   
		}
}