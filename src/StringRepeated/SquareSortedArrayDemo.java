package StringRepeated;

import java.util.Arrays;

public class SquareSortedArrayDemo {
	public static void main(String[] args) {
		int[]arr = {-6,-4,-1,2,4,5,7};
		int sorted[] = new int[arr.length];
		for(int i = 0; i<arr.length; i++) {
			 sorted[i] = arr[i]*arr[i];
		}
		for(int i = 0; i<sorted.length-1; i++) {
			if(sorted[i]>=sorted[i+1]) {
				int temp = sorted[i];
				sorted[i]= sorted[i+1];
				sorted[i+1]= temp;
			}
		}
		System.out.println(Arrays.toString(sorted));
	}

}
