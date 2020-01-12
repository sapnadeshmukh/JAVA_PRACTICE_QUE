package logical;

import java.util.Scanner;

public class SecondLastDigit {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Emter any number");
		int number = s.nextInt();
		int lastdigit=number%100;
		int t=(lastdigit%100)/10;
		System.out.println(lastdigit);
		System.out.println(t);
		
	}

}




