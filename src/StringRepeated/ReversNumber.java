package StringRepeated;

public class ReversNumber {
	public static void main(String[] args) {
		int number = 87660;
		int num = number;
		int reminder = 0;
		int rev=0;
		while(number > 0) {
			reminder = number%10;
			rev = rev*10 +reminder;
			number = number /10;
			
		}
		System.out.println("The reverse of " + num + " is " + rev );
	}

}
