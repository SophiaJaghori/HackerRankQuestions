package StringRepeated;

public class FindLargestNumber {
	public static void main(String[] args) {
		int []arr = {10,100,70,2000};
		int max = arr[0];
		for(int i = 1; i<arr.length; i++) {
			if(max<arr[i]) {
				max = arr[i];
			}
		}
		System.out.println("the largest number in this array is " + max);
	}

}
