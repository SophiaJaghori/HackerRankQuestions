package StringRepeated;

public class ReversWords {
	public static void main(String[] args) {
		String str = "Welcome to java Workd!";
		String str2[] = str.split(" ");
		
		
		for(int i = str2.length-1;i>=0; i--) {
			System.out.println(str2[i]);
			
		}
	}

}
