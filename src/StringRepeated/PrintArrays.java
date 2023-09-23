package StringRepeated;

import java.util.Arrays;

public class PrintArrays {
	public static void main(String[] args) {
		String str[] = {"Red","Green","Pink","Yashmi"};
		Integer integer[] = {1,2,3,4,5,6,7};
		//using arrays.toString
		System.out.println(Arrays.toString(str));
		System.out.println(Arrays.toString(integer));
		
		//2 using enhance for loop
		for(String s:str) {
			System.out.println(s + " ");
		}
		
		//array.aslist
		
		System.out.println(Arrays.asList(str));
	}

}
