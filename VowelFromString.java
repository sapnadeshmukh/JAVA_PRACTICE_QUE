package logical;

import java.util.Scanner;

public class VowelFromString {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Give any String");
		String s = scanner.nextLine();

		for (int i = 0; i < s.length(); i++) {
			char ch = s.charAt(i);
			if (ch == 'a'|| ch == 'i' || ch == 'e' || ch == 'o' || ch == 'u') {
				System.out.println(ch);
			
			}

		}
		

	}

}

