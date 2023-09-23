package StringRepeated;

public class FindNumCharacters {
	public static void main(String[] args) {
		String str = "Hello Java Class";
		char[]ch = str.toCharArray();
		String s = "";
		int count = 0;
		
		for(int i = 0; i<str.length(); i++) {
			while(i<ch.length && ch[i] !=' ') {
				s = s+ch[i];
				i++;
				count++;
			}
		}
		System.out.println("number of character in this string is "+ s +" "+ count);
	}

}
