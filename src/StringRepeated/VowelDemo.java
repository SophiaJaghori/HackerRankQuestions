package StringRepeated;

import java.util.Scanner;

public class VowelDemo {
	public static void main(String[] args) {
		System.out.println("Please enter a string");
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		int count = 0;
		char[]ch = str.toCharArray();
		for(char c:ch) {
			if(c=='a'|| c=='e'||c=='i'||c=='o'|| c=='u'||c=='A'||c=='E'||c=='I'||c=='O'||c=='U') {
				count++;
			}
		}
		System.out.println("number of vowels in this string is "+ count);
		
	}

}
