package StringRepeated;

public class StringComparison {
	public static void main(String[] args) {
		String str1 = "java";
		String str2 ="Javaaa";
		System.out.println(str1.equalsIgnoreCase(str2));
		
		System.out.println(str1.compareToIgnoreCase(str2));
		//System.out.println(CompareTwoString(str1,str2));
		
		System.out.println();
		
		
			
		
	}
	public static boolean CompareTwoString(String str1, String str2) {
		char[]str1Array = str1.toCharArray();
		char[]str2Array = str2.toCharArray();
		for(int i = 0; i<str1Array.length;i++ ) {
			if(str1Array[i]==str2Array[i]) {
				return true;
			}
		}
		return true;
		
	}

}
