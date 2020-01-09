package logical;

public class MultidimensionalArray {

	public static void main(String[] args) {
		int[][] a= {
				{11,12,4,5},{6,50,8},{4,1},
		};
//		to print all elements of 2d array using for loop
		for (int i=0;i< a.length;i++ ) {
			for (int j=0;j<a[i].length;j++) {
				System.out.println(a[i][j]);
			}
		}

	}

}
