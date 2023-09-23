package StringRepeated;

import java.util.Scanner;

public class StringPalindrom {
	public static void main(String[] args) {
		System.out.println("please enter the string");
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		Palindrom(str);
		
	}
	public static void Palindrom(String str) {
		String reverse = "";
		char[]c = str.toCharArray();
		for(int i = c.length-1;i>=0; i--) {
			reverse +=c[i];
		}
		if(reverse.equals(str)) {
			System.out.println("this is palindrome ");
		}
		else {
			System.out.println("Not palindrome");
		}
		
		System.out.println(reverse.toString());
	}

}
