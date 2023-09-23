package StringRepeated;

import java.util.Arrays;

public class InsertArrayInSpecificPosition {
	public static void main(String[] args) {
		int position = 3;
		int element = 0;
		int[]arr = {1,2,3,4,5,6,7,8};
		
		for(int i = arr.length-1; i>position; i--) {
			arr[i] = arr[i-1];
		}
		arr[position]=element;
		System.out.println(Arrays.toString(arr));
	}

}
