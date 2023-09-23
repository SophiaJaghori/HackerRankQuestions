package StringRepeated;

import java.util.HashMap;
import java.util.Map;

public class MejorityElement {
    public static void main(String[] args) {
        int arr[] = {2, 3, 4, 3, 4, 5, 6, 7, 3, 3};
        System.out.println("Majority Element is = " + MajorityElem(arr));
    }

    public static int MajorityElem(int[] arr) {
        int size = arr.length;
        Map<Integer, Integer> map = new HashMap<>();
        for (int i : arr) {
            Integer val = map.get(i);
            if (val == null) {
                map.put(i, 1);
            } else {
                map.put(i, val + 1);
            }
        }
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            if (entry.getValue() > (size/2)) {
                return entry.getKey();
            }
        }
        return -1; // No majority element found
    }
}
