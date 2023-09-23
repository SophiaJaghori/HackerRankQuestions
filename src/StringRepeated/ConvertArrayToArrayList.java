package StringRepeated;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ConvertArrayToArrayList {
	public static void main(String[] args) {
		String[]colors = {"Red","Green","Blue"};
		List list = Arrays.asList(colors);
		System.out.println(list);
		
		List<String>l = new ArrayList<>();
		Collections.addAll(l, colors);
		System.out.println(l);
		
		
	}

}
