package StringRepeated;

import java.util.HashSet;
import java.util.Set;

public class RemoveDuplicates {
	public static void main(String[] args) {
		String str = "JavaLinan";
		System.out.println(removDup(str));
	}
	
	public static String removDup(String str) {
		Set<Character>set = new HashSet<>();
		StringBuffer sf = new StringBuffer();
		for(int i = 0; i<str.length(); i++) {
			Character c = str.charAt(i);
			if(!set.contains(c)) {
				set.add(c);
				sf.append(c);
			}
		}
		
	
	return sf.toString();
	}
}
	


