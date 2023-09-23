package StringRepeated;

public class PanagramString {
	public static void main(String[] args) {
		String s = "The quick brown fox jumps over the lazy";
		System.out.println(StringPanagram(s.toLowerCase()));
		
	}
	public static boolean StringPanagram(String s) {
		if(s.length()<26){
			return false;
		}
		for(char ch = 'a';ch<='z'; ch++) {
			if(s.indexOf(ch)<0) {
				return false;
			}
		}
		return true;
	}

}
