package StringRepeated;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;

public class IterateOverHashMap {
	public static void main(String[] args) {
		Map<Integer,String>map = new HashMap<>();
		map.put(1,"Apple");
		map.put(2,"Orange");

		map.put(3,"Banana");

		map.put(4,"Mango");

		map.put(5,"Watermelon");
		map.put(6,"Grapes");
	//	keySetIteration(map);
		
		//IteratorMap(map);
		//streams(map);
		forEachLoop(map);

	}

	private static void forEachLoop(Map<Integer, String> map) {
		// TODO Auto-generated method stub
		map.forEach((key,value)->{
			System.out.println("key="+key);
			System.out.println("value ="+value);
		});
		
	}

	private static void streams(Map<Integer, String> map) {
		// TODO Auto-generated method stub
		map.entrySet().stream().forEach(e-> System.out.println("key = "+e.getKey()+" value = "+e.getValue()));
		
	}

	private static void IteratorMap(Map<Integer, String> map) {
		// TODO Auto-generated method stub
		Iterator<Map.Entry<Integer,String>>iterator = map.entrySet().iterator();
		while(iterator.hasNext()) {
			Entry<Integer, String>entry = iterator.next();
			System.out.println("key = "+entry.getKey());
			System.out.println("value = "+entry.getValue());
		}
		
	}

	private static void keySetIteration(Map<Integer, String> map) {
		// TODO Auto-generated method stub
		for(Integer fruitId: map.keySet()) {
			System.out.println("Key Value = "+fruitId);
			System.out.println("value = "+ map.get(fruitId));
		}
		
	}

}
