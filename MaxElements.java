package logical;

public class MaxElements {

	public static void main(String[] args) {
		int arr[] = { 1, 2, 3, 4,1000, 5, 6, 9, 100,6 };

		int max_num = arr[0];
		for (int index = 0; index < arr.length; index++) {
			if (arr[index] > max_num) {
				max_num = arr[index];

			}

		}
		System.out.println("Maxinum Number is :" + max_num);

	}

}