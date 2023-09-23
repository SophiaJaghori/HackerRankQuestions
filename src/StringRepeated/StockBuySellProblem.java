package StringRepeated;

import java.lang.reflect.Array;
import java.util.Arrays;

public class StockBuySellProblem {
	public static void main(String[] args) {
		int[]arr = {30,10,40,90,20};
		
		
		for(int i =0; i<=arr.length; i++) {
			for(int j=i+1; j<arr.length;j++) {
				if(arr[i]>=arr[j]) {
					int temp = arr[i];
					arr[i] = arr[j];
					arr[j]= temp;
					
				}
				
			}
			
		}
		System.out.println(Arrays.toString(arr));
		int highest_profit = arr[arr.length-1]- arr[0];
		System.out.println(highest_profit);
	}

}
