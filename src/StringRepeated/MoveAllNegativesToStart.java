package StringRepeated;

import java.util.Arrays;

public class MoveAllNegativesToStart {
	public static void main(String[] args) {
		int[]arr = {-1,0,-2,1,2,-3,3,4,-4};
		int j = 0;
		int[]arr2 = new int [arr.length];
		for(int i = 0; i<arr.length; i++) {
			if(arr[i]<0) {
				arr2[j]= arr[i];
				j++;
			}
		}
		for(int i = 0; i<arr.length; i++) {
			if(arr[i]>=0) {
				arr2[j]=arr[i];
				j++;
			}
		}
		System.out.println(Arrays.toString(arr2));
	}

}
