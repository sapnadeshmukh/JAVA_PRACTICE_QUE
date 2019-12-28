package logical;

public class RecursionExample {

	static int factorial(int n) {
		if (n==1) {
			return n;
		}
		else {
			return (n*factorial(n-1));
			
		}

	}
	public static void main(String[] args) {
		System.out.println("The Factorial of given number is  :" + factorial(5));
	}

}
