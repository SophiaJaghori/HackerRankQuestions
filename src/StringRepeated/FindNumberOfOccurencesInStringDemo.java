package StringRepeated;

import java.util.Scanner;

public class FindNumberOfOccurencesInStringDemo {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a string");
		
		String str = sc.nextLine();
		char c = 'a';
		int num = 0;
		for(int i = 0; i<str.length(); i++) {
			if(str.charAt(i)==c) {
				num++;
			}
		}
		System.out.println("number of the occurances of "+c +" in the string "+str+" is "+ num);
			
		
	}

}
