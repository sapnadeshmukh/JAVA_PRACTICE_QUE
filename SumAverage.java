package logical;

public class SumAverage {

	public static void main(String[] args) {
	int [] arr= {1,2,3,4,5,6,7,8,9,10,11};
	int sum=0;
	double average;
	for (int num:arr) {
		sum+=num;
		
	}
	int lengthArray=arr.length;
	average=( (double)sum /(double)lengthArray);
	System.out.println("Sum of all elements of array :" +sum);
	System.out.println("Average of all elements of array :"+ average);
	
	}

}
