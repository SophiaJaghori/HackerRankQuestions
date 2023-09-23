package StringRepeated;

import java.util.Random;

public class WaysToGenerateRandomNums {
	public static void main(String[] args) {
		Random rand = new Random();
		System.out.println(rand.nextInt(100));
		for(int i =0; i<=10; i++) {
			System.out.println(Math.random()+9);
		}
	}

}
