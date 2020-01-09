package logical;

public class MultidimensionalArray1 {

	public static void main(String[] args) {
//		declaration and initialization of array
		int[][] arr= {{21,22,23,33},{9,8,4,1},{10,35,38}};
//		print all elements of 2D array by using each loop
		for (int[] a:arr) {
			for(int b:a) {
				System.out.println(b);
			}
		}
	}

}
