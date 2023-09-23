package StringRepeated;

import java.util.Arrays;
import java.util.Scanner;

public class CompareNames {
	public static void main(String[] args) {
		NameSorting();
	}
	public static void NameSorting() {
		Scanner sc = new Scanner(System.in);
		System.out.println("How many names you want to enter?");
		int n = sc.nextInt();
		String[]names = new String[n];
		System.out.println("Enter all the names you want to sort");
		for(int i = 0; i<n; i++) {
			names[i] = sc.next();
			
		}
		for(int i = 0; i<n; i++) {
			for(int j = i+1; j<n; j++) {
				if(names[i].compareTo(names[j])>0) {
					String temp = names[i];
					names[i]= names[j];
					names[j]= temp;
				}
			}
		}
		System.out.println(Arrays.toString(names));
	}

}
