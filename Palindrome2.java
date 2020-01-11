package Practise;

import java.util.Scanner;
public class Palindrome2 {

	public static void main(String[] args) {
		long startTime = System.nanoTime();
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter a five digit number or -1 to quit: ");
		int number = input.nextInt();
		
		while(number != -1) {
			while((number%100000) != number) {
				System.out.print("Input more than 5 digits \n");
				System.out.print("Enter a five digit number or -1 to quit:  ");
				number = input.nextInt();
			}
		
			while((number%10000) == number) {
				System.out.print("Input less than 5 digits \n");
				System.out.print("Enter a five digit number or -1 to quit: ");
				number = input.nextInt();
			}
		
			int a = number/10000;
			int b = (number%10000)/1000;
			int c = (number%1000)/100;
			int d = (number%100)/10;
			int e = (number%10)/1;
			
			int lhs = a + b + c;
			int rhs = c + d + e;
			
			if(lhs == rhs) {
				System.out.print("Input is a Palindrome \n ");
			}else {
				System.out.print("Input is not a Palindrome \n");
			}
			
			System.out.print("Enter a five digit number or -1 to quit: ");
			number = input.nextInt();
		}	
		long endTime = System.nanoTime();
		System.out.println("Took" + (endTime - startTime) + "ns");
	}

}
