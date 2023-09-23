package StringRepeated;

public class SubStringsDemo {
	public static void main(String[] args) {
		PrintSubStrings("abc");
		
	}
	public static void PrintSubStrings(String str) {
		for(int i = 0; i<str.length(); i++) {
			for(int j = i+1; j<=str.length(); j++) {
				System.out.println(str.substring(i,j));
				
			}
		}
	}

}
