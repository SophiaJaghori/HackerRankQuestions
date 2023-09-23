package StringRepeated;

import java.util.HashSet;
import java.util.Set;

public class CommonElementsOfArray {
	public static void main(String[] args) {
		int arr1[]= {1,3,5,6,4};
		int arr2[]= {4,5,2,0,1};
		findIntersection(arr1,arr2);
		
	}
	public static void findIntersection(int[]arr1, int[]arr2) {
		Set<Integer>set =new HashSet<Integer>();
		for(int i = 0; i<arr1.length; i++) {
			set.add(arr1[i]);
		}
		for(int i =0; i<arr2.length; i++) {
			if(set.contains(arr2[i])){
				System.out.println(arr2[i]);
			}
		}
	}

}
