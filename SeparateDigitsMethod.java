package Practise;
import java.util.Scanner;
public class SeparateDigitsMethod {
	private static final Scanner scan = new Scanner(System.in);
	public static void main(String[] args) {
		System.out.print("Enter any number not above 99999: ");
		int number = scan.nextInt();
		
//		quotient(number);
		displayDigits(number);

	}
	public static int quotient(int num1) {
		int quotient = 0;
//		while(num1 != 0) {
			quotient = num1 / 10;
//			num1= num1 / 10;
//		}
//		
		return  quotient;
	}
	public static int remainder(int num1) {
		int remainder = 0;
		remainder = num1 % 10;
		return remainder;
	}
	public static void displayDigits(int number) {
		int k =quotient(number);
		for(int count = number; k!=0; number/=10 ) {
			remainder(number);
			System.out.print(remainder(number) + " ");
		}
	}
}