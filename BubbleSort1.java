package logical;

public class BubbleSort1 {

	public static void main(String[] args) {
		int a[] = { 70, 40, 50, 10,300,65 };
		int temp;
		for (int i = 1; i < a.length; i++) {
			for (int j = 0; j < a.length-1; j++) {
				if (a[j] > a[j + 1]) {
					temp = a[j];
					a[j] = a[j + 1];
					a[j + 1] = temp;
				}
			}
		}
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i] +" ");
		}
	}

}
