package StringRepeated;

public class BinarySearch {
	public static void main(String[] args) {
		int element = 8;
		int[]arr = {1,2,3,4,5,6,7,8};
		int min = arr[0];
		int max = arr[arr.length-1];
		if(max >= min) {
			int mid = min+((max-min)/2);
			if(element == arr[mid]);
			System.out.println(arr[mid]);
			if(element>=arr[mid]) {
				for(int i = arr[mid]; i<arr.length; i++) {
					if(arr[i]==element) {
						System.out.println("element is found in index "+ i);
					}
				}
			}
			if(element<=arr[mid]) {
				for(int i =0; i<arr[mid]; i++) {
					if(arr[i]==element) {
						System.out.println("element was found in index "+ i);
					}
				}
				
			}
			
		}
		
		
		
	
		
		
	}

}
