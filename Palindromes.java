package Practise;

import java.util.Scanner;
public class Palindromes {
	
	public static void main(String[] args) {
		//this private method gets the time that the code runs for.
				 long startTime = System.nanoTime();
		Scanner input = new Scanner(System.in);
		
		
		System.out.print("Enter five digits or -1 to quit : ");
		int number = input.nextInt();
		
		while(number != -1 ) {
			int reverse = 0;
			while((number/100000) >= 1) {
				System.out.println("Digits more than 5 \n");
				System.out.print("Enter five digits e.g \"12345\": ");
				number = input.nextInt();
			}
			while((number/10000) == 0) {
				System.out.println("digits less than 5 \n");
				System.out.print("Enter five digits e.g \"12345\": ");
				number = input.nextInt();
			}
			
			int value = number;
			
			while(value != 0) {
				int remainder = value % 10;
				reverse = reverse * 10 + remainder;
				value /= 10; 
				//System.out.printf("Each reverse is %d%n", reverse);
				//System.out.printf("Each value is %d%n", value);
			}
			
			if(number == reverse) {
				System.out.print("Number Entered is a Palindrome \n\n");
			}else {
				System.out.print("Number Not Palindrome \n\n");
			}
			
			System.out.print("Enter five digits or -1 to quit: ");
			number = input.nextInt();
			
		}
		long endTime = System.nanoTime();
		System.out.println("Took" + (endTime - startTime) + "ns");
	}

}
