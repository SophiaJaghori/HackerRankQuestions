package StringRepeated;

import java.util.Scanner;

public class RepeatStringClass {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		long n = sc.nextLong();
		long aCount = repeatIt(str, n);
		sc.close();
		
	}
	public static long repeatedString(String s, long n) {
		int strLength = s.length();
		long q =0, r = 0;
		q = n/strLength;
		r = n%strLength;
		long partialStrLen = (r==0)?0:r;
		long aCount = q * repeatIt(s, s.length())+ repeatIt(s,partialStrLen);
		return aCount;
	}
	public static long repeatIt(String s, long n) {
		long count = 0;
		for(int i =0; i< n; i++) {
			if(s.charAt(i)=='a') {
				count++;
			}
			
		}
		return count;
		
	}
	

}
