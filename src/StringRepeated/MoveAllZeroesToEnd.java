package StringRepeated;

import java.util.Arrays;

public class MoveAllZeroesToEnd {
	public static void main(String[] args) {
		int[]arr = {1,0,2,3,0,0,4,6,5,0};
		int NewArr[] = new int[arr.length];
		int j = 0;
		for(int i = 0; i<arr.length; i++) {
			if(arr[i]!=0) {
				NewArr[j] = arr[i];
				j++;
			}
		}
		for(int i = 0; i<arr.length; i++) {
			if(arr[i]==0) {
				NewArr[j]=arr[i];
				j++;
			}
		}
		System.out.println(Arrays.toString(NewArr));
	}

}
