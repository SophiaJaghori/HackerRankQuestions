package StringRepeated;

public class EvenLengthWords {
	public static void main(String[] args) {
		EvenLength("Hello world java classes come back");
		
	}
	public static void EvenLength(String str) {
		String [] newStr = str.split(" ");
		for(int i = 0; i<newStr.length; i++) {
			if(newStr[i].length()%2==0) {
				System.out.println(newStr[i]);
				
			}
		}
	}

}
