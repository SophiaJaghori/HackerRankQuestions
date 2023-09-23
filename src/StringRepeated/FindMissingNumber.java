package StringRepeated;

import java.util.HashSet;

public class FindMissingNumber {
	public static void main(String[] args) {
		Integer []a = {1, 2, 4, 5, 7,8,9,0};
		missingNumbers(a);
		
	}
	public static void missingNumbers(Integer[]a) {
		HashSet<Integer>set = new HashSet<Integer>();
		for(int num:a) {
			set.add(num);
		}
		for(int i = 0; i<a.length+1; i++) {
			if(!set.contains(i)) {
				System.out.println(i);
			}
		}
	}

}
