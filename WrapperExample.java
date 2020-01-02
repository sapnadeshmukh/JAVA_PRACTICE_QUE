package logical;

public class WrapperExample {
	// Autoboxing example of int to Integer

	public static void main(String[] args) {
		// Converting int into Integer

		int a = 20;
		Integer i = Integer.valueOf(a);// converting int into Integer explicitly
		Integer j = a;// autoboxing, now compiler will write Integer.valueOf(a) internally

		System.out.println(a + " " + i + " " + j);

		// Unboxing example of Integer to int

		// Converting Integer to int
		Integer b = new Integer(21);
		int c = b.intValue();// converting Integer to int explicitly
		int d = b;// unboxing, now compiler will write a.intValue() internally

		System.out.println(b + " " + c + " " + d);
	}
}
