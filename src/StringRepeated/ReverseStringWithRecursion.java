package StringRepeated;

public class ReverseStringWithRecursion {
	public static void main(String[] args) {
		String s = "Sunday";
		System.out.println(recursiveString(s));
		
	}
	public static String recursiveString(String st) {
		if(st == null || st.length()<=1) {
			return st;
		}
		return recursiveString(st.substring(1))+st.charAt(0);
	}

}
