package StringRepeated;

import java.util.Arrays;

public class NextGreaterElements {
	public static void main(String[] args) {
		int[]nums = {1,2,5,7,4,9,6,11};
		Arrays.sort(nums);
		for(int i = 0; i<nums.length-1;i++) {
			System.out.println("for "+ nums[i] + " next greater is "+ nums[i+1]);
	
			
		}
		System.out.println(Arrays.toString(nums));
		
	}

}
