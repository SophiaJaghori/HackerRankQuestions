package StringRepeated;

import java.util.LinkedHashMap;
import java.util.Map;


public class MajorityElements {
	public static void main(String[] args) {
		Map<Integer, Integer>map = new LinkedHashMap<Integer,Integer>();
		int[]arr = {10,20,10,10,40,30,10};
		for(int i = 0; i<arr.length; i++) {
			
			map.put(arr[i], map.getOrDefault(arr[i], 0)+1);
			
			
		}
		for(Map.Entry<Integer, Integer> entry:map.entrySet()) {
			if(entry.getValue()>arr.length/2) {
				int result = entry.getKey();
				System.out.println(result);
			}
			
		}
	}

}
