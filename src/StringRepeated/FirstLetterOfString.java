package StringRepeated;

public class FirstLetterOfString {
	public static void main(String[] args) {
		String str = "Learn coding here";
		firstLetter(str);
		
	}
	public static void firstLetter(String str) {
		String[]st = str.split(" ");
		for(int i = 0; i<st.length; i++) {
			String s = st[i];
			System.out.println(s.charAt(0));
		}
	}

}
