package StringRepeated;

public class findFirstDigitLastDigitSum {
	public static void main(String[] args) {
		int number = 134;
		int reminder=number;
		while(reminder >=10) {
			reminder = reminder/10;
			
			
		}
		int lastDigit = number%10;
		int sum = reminder +lastDigit;
		System.out.println("first digit "+ reminder);
		System.out.println("last digit "+ lastDigit);
		System.out.println("sum of two numbers are "+ sum);
		
		
		
	}

}
