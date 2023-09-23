package StringRepeated;

public class FindSumOfDigits {
	public static void main(String[] args) {
		int num = 1234;
		int number = num;
		int reminder = 0;
		int sum = 0;
		while(num>0) {
			reminder = num%10;
			sum = sum +reminder;
			num = num/10;
			
			
		}
		System.out.println("sum of the digits of " + number +" is "+ sum);
	}

}
