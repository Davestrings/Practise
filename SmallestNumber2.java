package Practise;

import java.util.Scanner;
public class SmallestNumber2 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		int i = 1;

			System.out.print("Enter number: ");
			int number = in.nextInt();
			
			int smallestNumber = number;
			
		while(number != -1) {
			
			if(number < smallestNumber) {
				smallestNumber = number;
				++i;
			}
			
			System.out.print("Enter number: ");
			number = in.nextInt();
		}
		System.out.printf("Smallest number is %d", smallestNumber);
	}

}
