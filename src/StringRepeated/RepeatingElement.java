package StringRepeated;



public class RepeatingElement {
	public static void main(String[] args) {
		int[]arr = {1,2,3,2,4,3};
		int[] temp = new int[arr.length];
		for(int i = 0; i<arr.length; i++) {
			if(temp[arr[i]]==1) {
				System.out.println(arr[i]);
				
			}
			else {
				temp[arr[i]]++;
			}
		}
	}
	
}

